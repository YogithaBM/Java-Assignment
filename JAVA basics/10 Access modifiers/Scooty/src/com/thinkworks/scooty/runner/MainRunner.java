package com.thinkworks.scooty.runner;

import com.thinkworks.scooty.owner.Address;
import com.thinkworks.scooty.owner.Owner;
import com.thinkworks.scooty.owner.Validation;
import com.thinkworks.scooty.properties.Brake;
import com.thinkworks.scooty.properties.Engine;
import com.thinkworks.scooty.properties.Wheel;

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
