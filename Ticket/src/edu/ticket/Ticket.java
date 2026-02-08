package edu.ticket;

public class Ticket {
    private final int id;
    private final Channel channel;
    private final TicketType type;

    private String request;
    private TicketStatus status;
    private String assignedTeam;
    private String response;

    public Ticket(int id, Channel channel, TicketType type, String request) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.request = request;
        this.status = TicketStatus.NEW;
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
}
