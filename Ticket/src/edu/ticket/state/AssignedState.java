package edu.ticket.state;

import edu.ticket.*;

public class AssignedState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.ASSIGNED;
    }

    @Override
    public void handle(TicketContext ctx) {
        Ticket ticket = ctx.getTicket();

        if (ticket.getType() == TicketType.BUG) {
            System.out.println("Assigned to engineering");
        } else {
            System.out.println("Assigned to support");
        }

        ctx.transitionTo(new InProgressState());
    }
}
