package Adapter.Example1;

//Hdmi is the target
public class UsbToHdmiAdapter implements HdmiPort {
    private UsbCable usbCable; //reference to adaptee

    public UsbToHdmiAdapter(UsbCable usbCable) {
        this.usbCable = usbCable;
    }

    @Override
    public void connectHdmi() {
        usbCable.connectedUsb();
        System.out.println("Converting Usb signal to HDMI");
    }
}
