package com.restaurant.customer;

public class Order {
    String orderName;
    int quantity;
    private void checkOrder() {
        System.out.println("Order : "+this.orderName);
    }
    private void checkQuantity() {
        System.out.println("Quantity : "+this.quantity);
    }
    public Order(String orderName,int quantity) {
        this.orderName=orderName;
        this.quantity=quantity;
        checkOrder();
        checkQuantity();
        System.out.println("Order placed");
    }


}
