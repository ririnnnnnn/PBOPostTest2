/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.sales;

import com.ticket.model.Ticket;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Axioo
 */
public class OnlineTicketSales extends TicketSales {
    private final ArrayList<Ticket> onlineTickets;

    public OnlineTicketSales() {
        super();
        onlineTickets = new ArrayList<>();
    }

    public void addOnlineTicket(Ticket ticket) {
        onlineTickets.add(ticket);
        System.out.println("Tiket online berhasil ditambahkan!");
    }

    public void displayOnlineTickets() {
        for (Ticket ticket : onlineTickets) {
            ticket.displayTicketInfo();
            System.out.println();
        }
    }

    @Override
    public void buyTicket() {
        System.out.println("Masukkan ID tiket yang ingin dibeli:");
        int id = new Scanner(System.in).nextInt();
        for (Ticket ticket : onlineTickets) {
            if (ticket.getId() == id) {
                System.out.println("Tiket ditemukan!");
                System.out.println("Harga tiket: " + ticket.getPrice());
                System.out.println("Apakah Anda ingin membeli tiket ini? (y/n)");
                String jawaban = new Scanner(System.in).next();
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