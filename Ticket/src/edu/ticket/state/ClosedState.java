package edu.ticket.state;

import edu.ticket.*;

public class ClosedState implements TicketState {

    @Override
    public TicketStatus getStatus() {
        return TicketStatus.CLOSED;
    }

    @Override
    public void handle(TicketContext ctx) {
        System.out.println("Ticket closed");
    }
}
