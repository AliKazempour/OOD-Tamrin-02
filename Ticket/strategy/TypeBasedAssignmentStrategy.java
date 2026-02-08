package edu.ticket.strategy;

import edu.ticket.Ticket;
import edu.ticket.TicketType;

public class TypeBasedAssignmentStrategy implements AssignmentStrategy {

    @Override
    public String resolveTeam(Ticket ticket) {
        return (ticket.getType() == TicketType.BUG) ? "engineering" : "support";
    }
}