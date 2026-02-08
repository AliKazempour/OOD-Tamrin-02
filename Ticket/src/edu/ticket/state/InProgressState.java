package edu.ticket.state;

import edu.ticket.*;

public class InProgressState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.IN_PROGRESS;
    }

    @Override
    public void handle(TicketContext ctx) {
        Ticket ticket = ctx.getTicket();

        System.out.println("Working on ticket");

        if (ticket.getType() == TicketType.BUG) {
            System.out.println("Sending bug response");
        } else {
            System.out.println("Sending generic response");
        }

        ctx.transitionTo(new ResolvedState());
    }
}
