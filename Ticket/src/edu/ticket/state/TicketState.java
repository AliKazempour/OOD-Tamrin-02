package edu.ticket.state;

import edu.ticket.TicketContext;
import edu.ticket.TicketStatus;

public interface TicketState {
    TicketStatus getStatus();
    void handle(TicketContext ctx);
}
