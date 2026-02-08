import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.Channel;
import edu.ticket.TicketType;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService();

        // Example 1: Bug reported from web
        Ticket ticket = new Ticket(
                1,
                Channel.WEB,
                TicketType.BUG,
                "I see a very very BAD BUG!");

        ticketService.handle(ticket);
    }
}
