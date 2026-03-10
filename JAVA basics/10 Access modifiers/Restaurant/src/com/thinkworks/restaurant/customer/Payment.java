package com.restaurant.customer;

public class Payment {
    String method;
    double amount;
    private void checkMethod() {
        System.out.println("Payment Method : " + this.method);
    }
    private void checkAmount() {
        System.out.println("Amount : " + this.amount);
    }
    public Payment(String method,double amount) {
        this.method = method;
        this.amount = amount;
        checkMethod();
        checkAmount();
        System.out.println("Payment successful");
    }



}
