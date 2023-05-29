package Decorator;

/**
 *
 * @author DELL
 */
public class BasicTicket implements Ticket {

    private String description;
    private double price;

    public BasicTicket() {
        description = "Basic Ticket";
        price = 0.0;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getInvoice() {
        return "\n" + getDescription() + "      1                  " + getPrice();
    }
}
