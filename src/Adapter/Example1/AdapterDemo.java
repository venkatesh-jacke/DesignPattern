package Adapter.Example1;

public class AdapterDemo {
    public static void main(String[] args) {
        //Incompatible Objects
        UsbCable usbCable = new UsbCable();
        Monitor monitor = new Monitor();

        //wrap Usb in the adapter
        HdmiPort adapter = new UsbToHdmiAdapter(usbCable);
        monitor.connectHdmi(); //Direct Hdmi
        adapter.connectHdmi();// Hdmi to Usb

    }
}
