package Decorator;

/**
 *
 * @author DELL
 */
public class RegularTicket implements Ticket {

    @Override
    public void generateTicket() {
        System.out.print("Fast Pass Access: ");
    }

}
