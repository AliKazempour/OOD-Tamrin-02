package edu.ticket.factory;

import edu.ticket.Channel;
import edu.ticket.Ticket;
import edu.ticket.TicketType;

public class ChannelBasedTicketFactory implements TicketFactory {

    @Override
    public Ticket create(int id, Channel channel, TicketType type, String request) {
        // Here we can add channel-specific preprocessing later
        String normalizedRequest = preprocess(channel, request);

        return new Ticket(id, channel, type, normalizedRequest);
    }

    private String preprocess(Channel channel, String request) {
        if (request == null) return "";

        // Example: channel-specific normalization hooks (extend later if needed)
        if (channel == Channel.EMAIL) {
            // e.g., trim signatures, normalize line breaks, etc.
            return request.trim();
        }

        if (channel == Channel.WEB) {
            // e.g., remove extra whitespace, sanitize, etc.
            return request.trim();
        }

        return request.trim();
    }
}
