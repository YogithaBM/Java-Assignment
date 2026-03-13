package com.thinkworks.company.dto;

public class Customer {
    private int customerId;
    private String name;
    private String email;
    private long phone;

    public Customer(int customerId,String name,String email,long phone){
        this.customerId=customerId;
        this.name=name;
        this.email=email;
        this.phone=phone;
    }

    public void setCustomerId(int customerId){

        this.customerId=customerId;
    }
    public int getCustomerId()
    {
        return customerId;
    }
    public void setName(String name){

        this.name=name;
    }
    public String getName(){

        return name;
    }
    public void setEmail(String email){

        this.email=email;
    }
    public String getEmail()
    {
        return email;
    }
    public void setPhone(long phone) {

        this.phone=phone;
    }
    public long getPhone()
    {
        return phone;
    }


}
