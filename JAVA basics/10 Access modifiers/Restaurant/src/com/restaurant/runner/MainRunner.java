package com.restaurant.runner;

import com.restaurant.customer.Customer;
import com.restaurant.customer.Order;
import com.restaurant.customer.Payment;
import com.restaurant.food.Dish;
import com.restaurant.food.Drink;
import com.restaurant.food.Menu;

public class MainRunner {
    public static void main(String[] args) {

        Dish dish = new Dish("Baaduuta", 8346.74D);
        System.out.println("  ");
        Menu menu = new Menu("South Indian", 35);
        System.out.println("  ");
        Drink drink = new Drink("Majge", 54);
        System.out.println("  ");

        Customer customer=new Customer("ShinChan",2);
        System.out.println("  ");
        Payment payment=new Payment("phone pay",783.365D);
        System.out.println("  ");
        Order Order=new Order("Penalty",3);

    }


}
