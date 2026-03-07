package com.scooty.runner;

import com.scooty.owner.Address;
import com.scooty.owner.Owner;
import com.scooty.owner.Validation;
import com.scooty.properties.Brake;
import com.scooty.properties.Engine;
import com.scooty.properties.Wheel;

public class MainRunner {
    public static void main(String[] args) {
        Owner owner=new Owner();
        owner.personaldetails("Mitzi",34);
        Address address=new Address();
        address.displayAddress("Bangalore",54);
        Validation validation=new Validation();
        validation.location(1997,371892346L);

        Brake brake=new Brake();
        brake.applyBrake(346.38d,"not good condition");
        Engine engine=new Engine();
        engine.startEngine(726.63d,35);
        Wheel wheel=new Wheel();
        wheel.rotateWheel(4,"very very good");
        


    }



}
