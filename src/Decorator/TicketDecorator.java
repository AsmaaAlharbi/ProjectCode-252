package Decorator;

/**
 *
 * @author DELL
 */
public abstract class TicketDecorator implements Ticket {

    protected Ticket decoratedTicket;

    public TicketDecorator(Ticket decoratedTicket) {
        this.decoratedTicket = decoratedTicket;
    }

    @Override
    public String getDescription() {
        return decoratedTicket.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedTicket.getPrice();
    }

    @Override
    public String getInvoice() {
        return decoratedTicket.getInvoice();
    }
}
