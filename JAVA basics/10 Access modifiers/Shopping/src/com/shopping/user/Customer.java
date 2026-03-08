package com.shopping.user;

public class Customer {
    private void  checkCustomerId(int id){
        System.out.println("CustomerId : "+id);
    }
    private void verifyCustomer(String name){
        System.out.println("verify Customer : "+name);

    }
    public void displayCustomer(String name, int id){
        System.out.println("display Customer");
        checkCustomerId(id);
        verifyCustomer(name);

    }
}
