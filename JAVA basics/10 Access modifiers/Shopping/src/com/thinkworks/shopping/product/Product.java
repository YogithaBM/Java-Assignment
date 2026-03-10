package com.shopping.product;

public class Product {
    private void checkStock(int quantity){
        System.out.println("quantity : "+quantity);
    }
    private void verifyProduct(String name){
        System.out.println("Product Name : "+name);
    }
    public void displayProduct(String name, int quantity){
        checkStock(quantity);
        verifyProduct(name);
        System.out.println("Product Display");
    }
}
