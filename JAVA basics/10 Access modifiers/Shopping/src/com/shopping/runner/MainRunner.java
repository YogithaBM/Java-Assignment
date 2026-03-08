package com.shopping.runner;

import com.shopping.product.Cart;
import com.shopping.product.Category;
import com.shopping.product.Product;
import com.shopping.user.Customer;
import com.shopping.user.Login;
import com.shopping.user.Registration;

public class MainRunner {
    public static void main(String[] args) {
        Product product = new Product();
        product.displayProduct("serum",2);
        System.out.println("  ");
        Category category =new Category();
        category.showCategory("hair spray");
        System.out.println("  ");
        Cart cart =new Cart();
        cart.viewCart("heat spray");
        System.out.println("  ");

        Customer customer =new Customer();
        customer.displayCustomer("Shane",345);
        System.out.println("  ");
        Login login =new Login();
        login.loginUser("Shane Hollander","hve284hd");
        System.out.println("  ");
        Registration registration=new Registration();
        registration.registerUser("Hudsonwilliam@gmail.com","7856334455");


    }
}
