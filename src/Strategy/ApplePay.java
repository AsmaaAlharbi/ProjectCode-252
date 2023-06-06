package Strategy;

/**
 *
 * @author DELL
 */
public class ApplePay implements Payment_Strategy {

    @Override
    public void Pay() {
        System.out.println("Paying using Apple Pay...");
    }
    
}
