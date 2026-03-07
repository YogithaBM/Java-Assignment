package com.scooty.owner;

public class Address {
    private void checkCity(String city){
        System.out.println("Check City : "+city);
    }
    private void checkPincode(int pincode){
        System.out.println("Pincode : "+pincode);

    }
    public void displayAddress(String city,int pincode){
        checkCity(city);
        checkPincode(pincode);
    }
}
