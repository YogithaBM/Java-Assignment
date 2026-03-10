package com.thinkworks.scooty.owner;

public class Validation{
    private void checkExpiry(int year){
        System.out.println("Expiry Year : "+year);
    }
    private void validateNumber(long number){
        System.out.println("Validate Number : "+number);
    }
    public void location(int year,long number){
        checkExpiry(year);
        validateNumber(number);
    }
}
