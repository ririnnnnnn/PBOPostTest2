/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.sales;

import com.ticket.model.Ticket;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Axioo
 */
public class TicketSales implements TicketInterface {
    private final ArrayList<Ticket> tickets;
    private final Scanner scanner;

    public TicketSales() {
        tickets = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @Override
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
        System.out.println("Tiket berhasil ditambahkan!");
    }

    @Override
    public void addTicket() {
        System.out.println("Masukkan ID tiket:");
        int id = scanner.nextInt();
        System.out.println("Masukkan nama tiket:");
        String name = scanner.next();
        System.out.println("Masukkan harga tiket:");
        while (true) {
            try {
                double price = scanner.nextDouble();
                Ticket ticket = new Ticket(id, name, price);
                tickets.add(ticket);
                System.out.println("Tiket berhasil ditambahkan!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Harga tiket harus berupa angka!");
                scanner.next();
            }
        }
    }

    @Override
    public void displayAllTickets() {
        for (Ticket ticket : tickets) {
            ticket.displayTicketInfo();
            System.out.println();
        }
    }

    @Override
    public void updateTicket() {
        System.out.println("Masukkan ID tiket yang ingin diupdate:");
        int id = scanner.nextInt();
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).getId() == id) {
                System.out.println("Masukkan nama tiket baru:");
                String name = scanner.next();
                System.out.println("Masukkan harga tiket baru:");
                while (true) {
                    try {
                        double price = scanner.nextDouble();
                        scanner.nextLine();
                        Ticket ticket = new Ticket(id, name, price);
                        tickets.set(i, ticket);
                        System.out.println("Tiket berhasil diupdate!");
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Harga tiket harus berupa angka!");
                        scanner.next();
                    }
                }
                return;
            }
        }
        System.out.println("Tiket tidak ditemukan!");
    }

    @Override
    public void deleteTicket() {
        System.out.println("Masukkan ID tiket yang ingin dihapus:");
        int id = scanner.nextInt();
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                tickets.remove(ticket);
                System.out.println("Tiket berhasil dihapus!");
                return;
            }
        }
        System.out.println("Tiket tidak ditemukan!");
    }
    
    @Override
    public void buyTicket() {
        System.out.println("Masukkan ID tiket yang ingin dibeli:");
        int id = scanner.nextInt();
        for (Ticket ticket : tickets) {
            if (ticket.getId() == id) {
                System.out.println("Tiket ditemukan!");
                System.out.println("Harga tiket: " + ticket.getPrice());
                System.out.println("Apakah Anda ingin membeli tiket ini? (y/n)");
                String jawaban = scanner.next();
                if (jawaban.equalsIgnoreCase("y")) {
                    System.out.println("Tiket berhasil dibeli!");
                    return;
                } else {
                    System.out.println("Pembelian tiket dibatalkan.");
                }
                return;
            }
        }
        System.out.println("Tiket tidak ditemukan!");
    }
}

