package usbDevice;

public class MemoryStick implements USBDevice{
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected Memory Stick");
        return true;
    }

    @Override
    public boolean disconnect() {
        if(!ejected){
            System.out.println("Please eject Memory Stick first");
            return false;
        }
        System.out.println("Disconnected Memory Stick");
        return true;
    }
    public void eject(){
        System.out.println("Ejecting memory Stick");
        ejected = true;
    }
    @Override
    public String getName() {
        return name;
    }
}
