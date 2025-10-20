package AbstractFactory.Example1;

public class BmwFactory implements IVehicleFactory{
    @Override
    public ISedan createSedan() {
        return new BmwSedan();
    }

    @Override
    public ISuv createSuv() {
        return new BmwSuv();
    }
}
