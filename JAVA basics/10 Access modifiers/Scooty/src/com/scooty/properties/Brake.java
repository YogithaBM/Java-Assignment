package com.scooty.properties;

public class Brake {
    private void checkBrakeFluid(double fluid){
        System.out.println("Brake Fluid : "+fluid);
    }
    private void checkPads(String condition){
        System.out.println("Pads Condition : "+condition);
    }
    public void applyBrake(double fluid,String condition){
        checkBrakeFluid(fluid);
        checkPads(condition);
    }
}
