package edu.ticket;

import edu.ticket.state.TicketState;
import edu.ticket.strategy.AssignmentStrategy;
import edu.ticket.strategy.ResponseStrategy;

public class TicketContext {
    private final Ticket ticket;
    private final TicketLogger logger;

    private final AssignmentStrategy assignmentStrategy;
    private final ResponseStrategy responseStrategy;

    public TicketContext(
            Ticket ticket,
            TicketLogger logger,
            AssignmentStrategy assignmentStrategy,
            ResponseStrategy responseStrategy
    ) {
        this.ticket = ticket;
        this.logger = logger;
        this.assignmentStrategy = assignmentStrategy;
        this.responseStrategy = responseStrategy;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public TicketLogger getLogger() {
        return logger;
    }

    public AssignmentStrategy getAssignmentStrategy() {
        return assignmentStrategy;
    }

    public ResponseStrategy getResponseStrategy() {
        return responseStrategy;
    }

    public void transitionTo(TicketState nextState) {
        ticket.setState(nextState); 
}