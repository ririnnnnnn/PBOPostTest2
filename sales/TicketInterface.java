/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ticket.sales;

/**
 *
 * @author Axioo
 */
import com.ticket.model.Ticket;
/**
 *
 * @author Axioo
 */
public interface TicketInterface {
    void addTicket(Ticket ticket);
    void addTicket();
    void displayAllTickets();
    void updateTicket();
    void deleteTicket();
    void buyTicket();
}