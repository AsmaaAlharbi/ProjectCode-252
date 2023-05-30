package Decorator;

/**
 *
 * @author DELL
 */
public abstract class TicketDecorator implements Ticket {

    protected Ticket decoratedTicket;

    public TicketDecorator(Ticket ticket) {
        this.decoratedTicket = ticket;
    }

    @Override
    public void generateTicket() {
        decoratedTicket.generateTicket();
    }

}
