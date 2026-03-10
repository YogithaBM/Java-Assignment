package com.shopping.product;

public class Cart {
    private void addItem(String item){
        System.out.println("Add Item : "+item);
    }
    private void removeItem(String item){
        System.out.println("Remove Item : "+item);
    }
    public void viewCart(String item){
        addItem(item);
        removeItem(item);
    }
}
