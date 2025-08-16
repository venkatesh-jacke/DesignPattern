package Strategy.Example1;

public class SchoolContext {
    TravelStrategy strategy;

    public SchoolContext(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy; //// Switch strategy anytime
    }

    public void gotoSchool() {
        strategy.gotoSchool();
    }
}
