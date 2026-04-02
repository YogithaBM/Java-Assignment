package com.thinkworks.hotelbookingsystem.runner;

import com.thinkworks.hotelbookingsystem.external.Guest;

public class MainRunner {
    public static void main(String[] args) {
        Guest guest = new Guest();

        guest.setId(1);
        guest.setName("John");
        guest.setContactNumber(9876543210L);

        guest.setStayType("VIP");

        System.out.println("Guest Details:");
        System.out.println("ID: " + guest.getId());
        System.out.println("Name: " + guest.getName());
        System.out.println("Contact: " + guest.getContactNumber());
        System.out.println("Stay Type: " + guest.getStayType());

    }
}
