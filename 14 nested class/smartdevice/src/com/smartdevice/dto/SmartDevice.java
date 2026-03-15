package com.smartdevice.dto;

public class SmartDevice {
    private String deviceId;
    private String deviceName;

    public SmartDevice(String deviceId,String deviceName) {
        this.deviceId=deviceId;
        this.deviceName=deviceName;
    }
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId=deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName=deviceName;
    }

    public static class Controller {
        private String controllerId;
        private String type;

        public Controller(String controllerId, String type) {
            this.controllerId = controllerId;
            this.type = type;
        }

        public String getControllerId() {
            return controllerId;
        }

        public String getType() {
            return type;
        }

        public void controlAction() {
            System.out.println("Controller "+ type+" is managing device");
        }
    }

    public class Sensor {
        String sensorId;
        String sensorType;
        double value;

        public Sensor(String sensorId, String sensorType, double value) {
            this.sensorId = sensorId;
            this.sensorType = sensorType;
            this.value = value;
        }

        public String getSensorId() {
            return sensorId;
        }

        public String getSensorType() {
            return sensorType;
        }

        public double getValue() {
            return value;
        }

        public void readSensor() {
            System.out.println("Sensor "+sensorType);
            System.out.println("Reading: "+value);
        }
    }
    public void runDiagnostics() {
        class DiagnosticTool {
            String toolName;

            public DiagnosticTool(String toolName) {
                this.toolName = toolName;
            }
            void performCheck() {
                System.out.println("Running diagnostics with "+toolName);
            }
        }
        DiagnosticTool tool = new DiagnosticTool("Samsung Members Diagnostics");
        tool.performCheck();
    }


}
