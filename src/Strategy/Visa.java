package Strategy;

/**
 *
 * @author DELL
 */
public class Visa implements Payment {

    @Override
    public void Pay() {
        System.out.println("Paying using Visa...");
    }
    
}
