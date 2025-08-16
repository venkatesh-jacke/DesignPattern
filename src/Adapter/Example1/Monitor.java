package Adapter.Example1;

public class Monitor implements HdmiPort{
    @Override
    public void connectHdmi() {
        System.out.println("Hdmi Connected.......");
    }
}
