package Strategy.Example1;

public class BikeStrategy implements TravelStrategy{
    @Override
    public void gotoSchool() {
        System.out.println("I will go by bike");
    }
}
