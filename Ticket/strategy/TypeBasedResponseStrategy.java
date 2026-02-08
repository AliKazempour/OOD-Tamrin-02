package edu.ticket.strategy;

import edu.ticket.Ticket;
import edu.ticket.TicketType;

public class TypeBasedResponseStrategy implements ResponseStrategy {

    private final ResponseStrategy bug = new BugResponseStrategy();
    private final ResponseStrategy generic = new GenericResponseStrategy();

    @Override
    public String createResponse(Ticket ticket) {
        return (ticket.getType() == TicketType.BUG)
                ? bug.createResponse(ticket)
                : generic.createResponse(ticket);
    }
}