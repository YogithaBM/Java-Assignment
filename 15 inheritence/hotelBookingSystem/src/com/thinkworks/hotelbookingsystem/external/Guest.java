package com.thinkworks.hotelbookingsystem.external;

public class Guest extends Person{
    private String stayType;

    public Guest() {
        System.out.println("Guest constructor");
    }

    public String getStayType() {
        return stayType;
    }

    public void setStayType(String stayType) {
        this.stayType = stayType;
    }
}

