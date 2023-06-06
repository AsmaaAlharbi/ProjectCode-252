package Strategy;

/**
 *
 * @author DELL
 */
public class StrategyContext {
    
    Payment_Strategy strategy;

    public StrategyContext(Payment_Strategy strategy) {
        this.strategy = strategy;
    }
    

    public void executePayment() {
        strategy.Pay();
    }
    
}
