package Builder.Example1;

//https://www.linkedin.com/posts/sohailashraf31_builder-pattern-activity-7344919287725178880-eYfy?utm_source=share&utm_medium=member_desktop&rcm=ACoAADQfhrABusil0TePI1oqifcQk611TWEQkcs
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
