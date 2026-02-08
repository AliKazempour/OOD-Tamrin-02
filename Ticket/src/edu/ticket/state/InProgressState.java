package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.TicketContext;
import edu.ticket.TicketStatus;

public class InProgressState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.IN_PROGRESS;
    }

    @Override
    public void handle(TicketContext ctx) {
        Ticket ticket = ctx.getTicket();

        System.out.println("Working on ticket");

        String response = ctx.getResponseStrategy().createResponse(ticket);
        ticket.setResponse(response);

        System.out.println("Sending response: " + response);

        ctx.transitionTo(new ResolvedState());
    }
}