package Strategy;

/**
 *
 * @author DELL
 */
public class PaymentFactory {

    public Payment getPay(int option) {

        if (option == 1) {
            return new ApplePay();

        } else if (option == 2) {
            return new CreditCard();

        } else if (option == 3) {
            return new Visa();

        } else {
            return null;
        }
    }
}
