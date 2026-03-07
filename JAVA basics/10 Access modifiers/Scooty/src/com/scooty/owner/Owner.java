package com.scooty.owner;

public class Owner {
    private void name(String ownerName){
        System.out.println("Owner : "+ownerName);

    }
    private void age(int ownerAge){
        System.out.println("Age : "+ownerAge);

    }
    public void personaldetails(String ownerName,int ownerAge){
        name(ownerName);
        age(ownerAge);
        if(ownerAge>=18){
            System.out.println("Owner can ride the scooty");
        }

    }

}
