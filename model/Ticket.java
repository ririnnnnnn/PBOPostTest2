/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ticket.model;

/**
 *
 * @author Axioo
 */
public class Ticket {
    private int id;
    private String name;
    private double price;

    public Ticket(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void displayTicketInfo() {
        System.out.println("Ticket ID: " + id);
        System.out.println("Ticket Name: " + name);
        System.out.println("Ticket Price: " + price);
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}