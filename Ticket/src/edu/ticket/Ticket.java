package edu.ticket;

import edu.ticket.state.NewState;
import edu.ticket.state.TicketState;

public class Ticket {
    private final int id;
    private final Channel channel;
    private final TicketType type;

    private String request;
    private TicketStatus status;
    private String assignedTeam;
    private String response;

    private TicketState state;

    public Ticket(int id, Channel channel, TicketType type, String request) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.request = request;

        this.state = new NewState();
        this.status = this.state.getStatus(); // keep status in sync with initial state
    }

    public int getId() {
        return id;
    }

    public Channel getChannel() {
        return channel;
    }

    public TicketType getType() {
        return type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public String getAssignedTeam() {
        return assignedTeam;
    }

    public void setAssignedTeam(String assignedTeam) {
        this.assignedTeam = assignedTeam;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public TicketState getState() {
        return state;
    }

    public void setState(TicketState state) {
        this.state = state;
        this.status = state.getStatus(); // keep status in sync whenever state changes
    }
}
