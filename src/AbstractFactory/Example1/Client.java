package AbstractFactory.Example1;

public class Client {
    ISuv suv;
    ISedan sedan;
    public Client(IVehicleFactory vehicleFactory){
        suv= vehicleFactory.createSuv();
        sedan=vehicleFactory.createSedan();
    }
    public void getVehicleInfo(){
        System.out.println("\n---------Sedan Model Details----------");
        System.out.println(sedan.getModelName());
        System.out.println("\n---------Suv Model Details----------");
        System.out.println(suv.getModelName());
    }
}
