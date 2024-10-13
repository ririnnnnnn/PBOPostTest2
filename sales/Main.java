
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.sales;

import com.ticket.model.Ticket;
import java.util.Scanner;
/**
 *
 * @author Axioo
 */
public class Main {
    public static void main(String[] args) {
        TicketSales ticketSales = new TicketSales();
        Scanner scanner = new Scanner(System.in);

        ticketSales.addTicket(new Ticket(101, "Tiket Standar", 100.0));
        ticketSales.addTicket(new Ticket(102, "Tiket VIP", 200.0));

        while (true) {
            System.out.println("=====================================");
            System.out.println("Selamat Datang di Wonderland!");
            System.out.println("=====================================");
            System.out.println("Menu Utama:");
            System.out.println("1. Sebagai Admin");
            System.out.println("2. Sebagai Pembeli");
            System.out.println("3. Keluar");
            System.out.println("=====================================");
            System.out.print("Silahkan memilih menu: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    menuAdmin(ticketSales, scanner);
                    break;
                case 2:
                    menuPembeli(ticketSales, scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih telah mencoba program Wonderland. Sampai Jumpa!");
                    return;
                default:
                    System.out.println("Menu yg anda masukkan tidak valid!");
            }
        }
    }

    public static void menuAdmin(TicketSales ticketSales, Scanner scanner) {
        while (true) {
            System.out.println("=====================================");
            System.out.println("Menu Admin:");
            System.out.println("1. Menambah Tiket");
            System.out.println("2. Menampilkan Semua Tiket");
            System.out.println("3. Memperbarui Tiket");
            System.out.println("4. Menghapus Tiket");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.println("=====================================");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ticketSales.addTicket();
                    break;
                case 2:
                    ticketSales.displayAllTickets();
                    break;
                case 3:
                    ticketSales.updateTicket();
                    break;
                case 4:
                    ticketSales.deleteTicket();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Menu yg anda masukkan tidak valid!");
            }
        }
    }

    public static void menuPembeli(TicketSales ticketSales, Scanner scanner) {
        while (true) {
            System.out.println("=====================================");
            System.out.println("Menu Pembeli:");
            System.out.println("1. Beli Tiket");
            System.out.println("2. Kembali ke Menu Utama");
            System.out.println("=====================================");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ticketSales.buyTicket();
                    break;
                case 2:
                    return;
                default:
                    System.out.println("Menu yg anda masukkan tidak valid!");
            }
        }
    }
}