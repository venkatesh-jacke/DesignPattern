package AbstractFactory.Example1;

public class Main {
    public static void main(String[] args) {
        Client bmwClient = new Client(new BmwFactory());
        bmwClient.getVehicleInfo();
        Client hondaClient = new Client(new HondaFactory());
        hondaClient.getVehicleInfo();
    }
}
