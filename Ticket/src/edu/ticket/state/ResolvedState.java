package edu.ticket.state;

import edu.ticket.*;

public class ResolvedState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.RESOLVED;
    }

    @Override
    public void handle(TicketContext ctx) {
        System.out.println("Ticket resolved");
        ctx.transitionTo(new ClosedState());
    }
}
