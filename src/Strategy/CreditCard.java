package Strategy;

/**
 *
 * @author DELL
 */
public class CreditCard implements Payment_Strategy {

    @Override
    public void Pay() {
        System.out.println("Paying using Credit Card...");
    }
    
}
