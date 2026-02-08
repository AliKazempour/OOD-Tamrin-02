package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.TicketContext;
import edu.ticket.TicketStatus;

public class AssignedState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.ASSIGNED;
    }

    @Override
    public void handle(TicketContext ctx) {
        Ticket ticket = ctx.getTicket();

        String team = ctx.getAssignmentStrategy().resolveTeam(ticket);
        ticket.setAssignedTeam(team);

        System.out.println("Assigned to " + team);

        ctx.transitionTo(new InProgressState());
    }
}