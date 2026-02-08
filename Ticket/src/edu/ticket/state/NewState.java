package edu.ticket.state;

import edu.ticket.*;

public class NewState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.NEW;
    }

    @Override
    public void handle(TicketContext ctx) {
        Ticket ticket = ctx.getTicket();

        System.out.println("Ticket created");

        if (ticket.getChannel() == Channel.WEB) {
            System.out.println("Received from web");
        } else if (ticket.getChannel() == Channel.EMAIL) {
            System.out.println("Received from email");
        }

        ctx.transitionTo(new AssignedState());
    }
}
