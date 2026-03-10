package com.thinkworks.scooty.properties;

public class Wheel {
    private void wheelCount(int wheels){
        System.out.println("Wheel Count : "+wheels);

    }
    private void tyreCondition(String condition){
        System.out.println("Tyre Condition : "+condition);
    }
    public void rotateWheel(int wheels,String condition){
        wheelCount(wheels);
        tyreCondition(condition);
    }
}
