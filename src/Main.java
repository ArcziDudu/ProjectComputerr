import Drive.HDDDrive;
import Drive.SSDDrive;
import usbDevice.MemoryStick;
import usbDevice.Mouse;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);


        MemoryStick memoryStick = new MemoryStick("Pendrive");
        Mouse mouse = new Mouse("Mysz");


        computer.addUSBDevice(mouse);
        computer.addUSBDevice(memoryStick);

        memoryStick.eject();
        computer.removeUsbDevices(memoryStick);
        computer.removeUsbDevices(mouse);



    }
}