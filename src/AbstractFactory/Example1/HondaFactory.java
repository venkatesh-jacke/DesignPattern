package AbstractFactory.Example1;

public class HondaFactory implements IVehicleFactory{
    @Override
    public ISedan createSedan() {
        return new HondaSedan();
    }

    @Override
    public ISuv createSuv() {
        return new HondaSuv();
    }
}
