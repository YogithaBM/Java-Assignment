package com.thinkworks.company.dto;

public class Order {
    private int orderId;
    private Customer customer;
    private Product[] products;
    private int productCount;

    Order (int orderId,Customer customer,Product[] products,int productCount){
        this.orderId=orderId;
        this.customer=customer;
        this.products=products;
        this.productCount=productCount;
    }
    public double calculateOrderValue(){

    }


}
