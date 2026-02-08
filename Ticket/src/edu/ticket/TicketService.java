package edu.ticket;

import edu.ticket.strategy.AssignmentStrategy;
import edu.ticket.strategy.ResponseStrategy;

public class TicketService {

    private final TicketLogger logger;
    private final AssignmentStrategy assignmentStrategy;
    private final ResponseStrategy responseStrategy;

    public TicketService(
            TicketLogger logger,
            AssignmentStrategy assignmentStrategy,
            ResponseStrategy responseStrategy
    ) {
        this.logger = logger;
        this.assignmentStrategy = assignmentStrategy;
        this.responseStrategy = responseStrategy;
    }

    public void handle(Ticket ticket) {
        TicketContext ctx = new TicketContext(ticket, logger, assignmentStrategy, responseStrategy);

        ticket.getState().handle(ctx);

        logger.log(ticket, "Handled -> status=" + ticket.getStatus()
                + ", team=" + ticket.getAssignedTeam()
                + ", response=" + ticket.getResponse());
    }
}