package com.restaurant.customer;

public class Customer {
    String name;
    int tableNo;
    private void checkCustomer() {
        System.out.println("Customer : "+this.name);
    }
    private void checkTable() {
        System.out.println("Table Number : "+this.tableNo);
    }

    public Customer(String name,int tableNo) {
        this.name = name;
        this.tableNo = tableNo;
        checkCustomer();
        checkTable();
    }


}
