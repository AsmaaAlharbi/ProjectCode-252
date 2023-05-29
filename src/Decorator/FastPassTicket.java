package Decorator;

/**
 *
 * @author DELL
 */
public class FastPassTicket extends TicketDecorator {

    private static final double FAST_PASS_PRICE = 20.0;

    public FastPassTicket(Ticket decoratedTicket) {
        super(decoratedTicket);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + FAST_PASS_PRICE;
    }

    @Override
    public String getInvoice() {
        return super.getInvoice() + "\nFast Pass Ticket      1                  " + FAST_PASS_PRICE;
    }
}
