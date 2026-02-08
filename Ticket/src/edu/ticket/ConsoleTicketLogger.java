package edu.ticket;

public class ConsoleTicketLogger implements TicketLogger {

    @Override
    public void log(Ticket ticket, String message) {
        System.out.println("[LOG] Ticket " + ticket.getId() + ": " + message);
    }
}