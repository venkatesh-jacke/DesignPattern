package Strategy.Example1;

public class WalkStrategy implements TravelStrategy{
    @Override
    public void gotoSchool() {
        System.out.println("I will go by Walking");
    }
}
