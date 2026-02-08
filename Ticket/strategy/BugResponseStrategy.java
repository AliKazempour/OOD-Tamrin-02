package edu.ticket.strategy;

import edu.ticket.Ticket;

public class BugResponseStrategy implements ResponseStrategy {

    @Override
    public String createResponse(Ticket ticket) {
        return "Bug report received. Engineering will investigate and follow up.";
    }
}