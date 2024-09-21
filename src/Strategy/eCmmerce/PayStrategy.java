package Strategy.eCmmerce;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
