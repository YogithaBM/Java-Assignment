package com.smartdevice.runner;

import com.smartdevice.dto.SmartDevice;
import com.smartdevice.service.DeviceService;

public class MainRunner {
    public static void main(String[] args) {

        SmartDevice device=new SmartDevice("563", "Smart Light");
        SmartDevice.Controller controller=new SmartDevice.Controller("846", "Light Controller");
        SmartDevice.Sensor sensor=device.new Sensor("745", "Light Sensor", 875.487D);

        DeviceService service=new DeviceService();
        service.printDeviceDetails(device);
        System.out.println();
        service.printControllerDetails(controller);
        System.out.println();
        service.printSensorDetails(sensor);
        System.out.println();
        service.runDeviceDiagnostics(device);
    }
}
