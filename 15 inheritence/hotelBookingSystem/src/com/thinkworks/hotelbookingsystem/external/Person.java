package com.thinkworks.hotelbookingsystem.external;

public class Person {
    private int id;
    private String name;
    private long contactNumber;

    public Person() {
        System.out.println("no  argument constructor");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public long getContactNumber() { return contactNumber; }
    public void setContactNumber(long contactNumber) { this.contactNumber = contactNumber; }
}

