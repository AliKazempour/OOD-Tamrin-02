package edu.ticket.strategy;

import edu.ticket.Ticket;

public class GenericResponseStrategy implements ResponseStrategy {

    @Override
    public String createResponse(Ticket ticket) {
        return "Thanks for your request. Support will get back to you shortly.";
    }
}