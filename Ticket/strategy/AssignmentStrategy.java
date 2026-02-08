package edu.ticket.strategy;

import edu.ticket.Ticket;

public interface AssignmentStrategy {
    String resolveTeam(Ticket ticket); // e.g., "engineering" / "support"
}