package edu.ticket;

public class TicketService {

    private final TicketLogger logger;

    public TicketService(TicketLogger logger) {
        this.logger = logger;
    }

    public void handle(Ticket ticket) {
        TicketContext ctx = new TicketContext(ticket, logger);

        // Delegate handling to current state
        ticket.getState().handle(ctx);

        // Final logging
        logger.log(ticket, "Handled -> status=" + ticket.getStatus());
    }
}
