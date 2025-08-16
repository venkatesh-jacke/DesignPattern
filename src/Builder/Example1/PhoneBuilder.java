package Builder.Example1;

public class PhoneBuilder {
    private String os = "Unknown OS";  // Default value
    private String processor = "Unknown Processor";
    private String ram = "4GB";  // Default RAM
    private String storage = "64GB"; // Default Storage
    private String battery = "3000mAh"; // Default Battery
    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }


    public PhoneBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public Phone buildPhone() {
        return new Phone(os, processor, ram, storage, battery);
    }
}
