package Strategy.eCmmerce;

public class Order {
    int totalCost=0;
    boolean isClosed;

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }

    public void processOrder(PayStrategy strategy){
        strategy.collectPaymentDetails();
    }
}
