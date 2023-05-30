package Decorator;

/**
 *
 * @author DELL
 */
public class FastPassTicketDecorator extends TicketDecorator {

    public FastPassTicketDecorator(Ticket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public void generateTicket() {
        decoratedTicket.generateTicket(); // System.out.print("Fast Pass Access: ");
        EnabledFastPass();
    }

    public void EnabledFastPass() {
        System.out.print("Enabled\n");
    }
}
