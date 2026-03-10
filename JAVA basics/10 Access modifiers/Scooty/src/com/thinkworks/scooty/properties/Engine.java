package com.thinkworks.scooty.properties;

public class Engine {
    private void checkOilLevel(double oil){
        System.out.println("Oil Level : "+oil);
    }
    private void checkTemperature(int temperature){
        System.out.println("Temperature : "+temperature);
    }
    public void startEngine(double oil,int temperature){
        checkOilLevel(oil);
        checkTemperature(temperature);

    }
}
