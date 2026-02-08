import edu.ticket.*;
import edu.ticket.factory.ChannelBasedTicketFactory;
import edu.ticket.factory.TicketFactory;
import edu.ticket.strategy.TypeBasedAssignmentStrategy;
import edu.ticket.strategy.TypeBasedResponseStrategy;

public class Main {

    public static void main(String[] args) {

        TicketService ticketService = new TicketService(
                new ConsoleTicketLogger(),
                new TypeBasedAssignmentStrategy(),
                new TypeBasedResponseStrategy()
        );

        TicketFactory factory = new ChannelBasedTicketFactory();

        Ticket ticket = factory.create(
                1,
                Channel.WEB,
                TicketType.BUG,
                "I see a very very BAD BUG!"
        );

        // Run through the whole lifecycle
        for (int i = 0; i < 5; i++) {
            ticketService.handle(ticket);
        }
    }
}
