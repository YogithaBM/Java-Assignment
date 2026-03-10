package com.restaurant.food;

public class Dish {
    String dishName;
    double price;
    private void checkDish(){
        System.out.println("Dish : "+this.dishName);
    }
    private void checkPrice(){
        System.out.println("Price : "+this.price);

    }
    public Dish(String dishName,double price){
        this.dishName=dishName;
        this.price=price;
        checkDish();
        checkPrice();


    }
}
