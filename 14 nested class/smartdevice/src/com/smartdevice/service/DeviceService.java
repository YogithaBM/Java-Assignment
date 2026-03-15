package com.smartdevice.service;

import com.smartdevice.dto.SmartDevice;

public class DeviceService {
    public void printDeviceDetails(SmartDevice device) {
        System.out.println("Device ID: "+device.getDeviceId());
        System.out.println("Device Name: "+device.getDeviceName());
    }

    public void printControllerDetails(SmartDevice.Controller controller) {
        System.out.println("Controller ID: "+controller.getControllerId());
        System.out.println("Controller Type: "+controller.getType());
        controller.controlAction();
    }

    public void printSensorDetails(SmartDevice.Sensor sensor) {
        System.out.println("Sensor ID: "+sensor.getSensorId());
        System.out.println("Sensor Type: "+sensor.getSensorType());
        System.out.println("Sensor Value: "+sensor.getValue());
        sensor.readSensor();
    }

    public void runDeviceDiagnostics(SmartDevice device) {
        device.runDiagnostics();
    }

}
