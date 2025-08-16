package Strategy.Example1;

public class TrainStrategy implements TravelStrategy{
    @Override
    public void gotoSchool() {
        System.out.println("I go by train");
    }
}
