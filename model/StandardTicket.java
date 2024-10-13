/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.model;

/**
 *
 * @author Axioo
 */
public class StandardTicket extends Ticket {
    public StandardTicket(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void displayTicketInfo() {
        super.displayTicketInfo();
        System.out.println("Tiket Standar");
    }
}