import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.Channel;
import edu.ticket.TicketType;
import edu.ticket.ConsoleTicketLogger;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService(new ConsoleTicketLogger());

        Ticket ticket = new Ticket(
                1,
                Channel.WEB,
                TicketType.BUG,
                "I see a very very BAD BUG!"
        );

        ticketService.handle(ticket);
        ticketService.handle(ticket);
        ticketService.handle(ticket);
        ticketService.handle(ticket);
        ticketService.handle(ticket);
        ticketService.handle(ticket);

    }
}