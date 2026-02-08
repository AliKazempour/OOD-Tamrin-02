package edu.ticket;

import edu.ticket.state.TicketState;

public class TicketContext {
    private final Ticket ticket;
    private final TicketLogger logger;

    public TicketContext(Ticket ticket, TicketLogger logger) {
        this.ticket = ticket;
        this.logger = logger;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public TicketLogger getLogger() {
        return logger;
    }

    public void transitionTo(TicketState nextState) {
        ticket.setState(nextState);
        ticket.setStatus(nextState.getStatus());
    }
}
