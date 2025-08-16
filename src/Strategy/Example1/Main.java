package Strategy.Example1;

public class Main {
    public static void main(String[] args) {
        SchoolContext schoolContext = new SchoolContext(new BikeStrategy());
        schoolContext.gotoSchool();
        schoolContext.setStrategy(new TrainStrategy());
        schoolContext.gotoSchool();
    }
}
