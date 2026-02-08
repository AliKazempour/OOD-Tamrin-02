import edu.ticket.*;
import edu.ticket.strategy.TypeBasedAssignmentStrategy;
import edu.ticket.strategy.TypeBasedResponseStrategy;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService(
                new ConsoleTicketLogger(),
                new TypeBasedAssignmentStrategy(),
                new TypeBasedResponseStrategy()
        );

        Ticket ticket = new Ticket(
                1,
                Channel.WEB,
                TicketType.BUG,
                "I see a very very BAD BUG!"
        );

        
        for (int i = 0; i < 5; i++) {
            ticketService.handle(ticket);
        }
    }
}