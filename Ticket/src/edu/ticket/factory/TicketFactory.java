package edu.ticket.factory;

import edu.ticket.Channel;
import edu.ticket.Ticket;
import edu.ticket.TicketType;

public interface TicketFactory {
    Ticket create(int id, Channel channel, TicketType type, String request);
}
