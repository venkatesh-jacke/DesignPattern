package Builder.Example1;

public class Shop {
    public static void main(String[] args) {
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone phone = phoneBuilder
                .setOs("Android")
                .setProcessor("Snapdragon 888")
                .setRam("8GB")
                .setStorage("128GB")
                .setBattery("4500mAh")
                .buildPhone();
        System.out.println(phone);
    }
}
