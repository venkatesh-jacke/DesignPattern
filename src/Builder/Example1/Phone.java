package Builder.Example1;

public class Phone {
    String os;
    String processor;
    String ram;
    String storage;
    String battery;

    public Phone(String os, String processor, String ram, String storage, String battery) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
