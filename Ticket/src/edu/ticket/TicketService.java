package edu.ticket;

public class TicketService {

    public void handle(Ticket ticket) {

        TicketStatus currentStatus = ticket.getStatus();
        TicketType type = ticket.getType();
        Channel channel = ticket.getChannel();

        if (currentStatus == TicketStatus.NEW) {
            System.out.println("Ticket created");

            if (channel == Channel.WEB) {
                System.out.println("Received from web");
            } else if (channel == Channel.EMAIL) {
                System.out.println("Received from email");
            }

            ticket.setStatus(TicketStatus.ASSIGNED);
        }

        if (currentStatus == TicketStatus.ASSIGNED) {
            if (type == TicketType.BUG) {
                System.out.println("Assigned to engineering");
            } else {
                System.out.println("Assigned to support");
            }
            ticket.setStatus(TicketStatus.IN_PROGRESS);
        }

        if (currentStatus == TicketStatus.IN_PROGRESS) {
            System.out.println("Working on ticket");

            if (type == TicketType.BUG) {
                System.out.println("Sending bug response");
            } else {
                System.out.println("Sending generic response");
            }

            ticket.setStatus(TicketStatus.RESOLVED);
        }

        if (currentStatus == TicketStatus.RESOLVED) {
            System.out.println("Ticket resolved");
            ticket.setStatus(TicketStatus.CLOSED);
        }

        if (currentStatus == TicketStatus.CLOSED) {
            System.out.println("Ticket closed");
        }

        System.out.println(
            "Logging ticket handling : " +
            ticket.getId() +
            " -> " +
            ticket.getStatus()
        );
    }
}
