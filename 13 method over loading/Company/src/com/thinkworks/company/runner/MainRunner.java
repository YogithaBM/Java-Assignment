package com.thinkworks.company.runner;

import com.thinkworks.company.dto.Customer;
import com.thinkworks.company.dto.Order;
import com.thinkworks.company.dto.Product;
import com.thinkworks.company.service.InventoryService;

import static com.thinkworks.company.service.InventoryService.COMPANY_NAME;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("Company Name: "+COMPANY_NAME);
        Product product = new Product(233, "Shinchan sock",
                540.34D, 2, "Clothes");
        Product product1=new Product(32,"shinchan shirt",
                43.34D,3,"clothes");
        Product product2=new Product(343,"Shinchan Pants",345.345D,
                4,"Clothes");
        Product[] products={product,product1,product2};


        Customer customer = new Customer(243, "Gaten",
                "gaten1983@gamil.com", 873653478L);

        Order order=new Order(323,customer,products,3);
        System.out.println("    ");
        InventoryService inventoryService=new InventoryService();
            inventoryService.printProductDetails(product);
        System.out.println("    ");
            inventoryService.printCustomerDetails(customer);
        System.out.println("    ");
        inventoryService.printOrderDetails(order);
        System.out.println("    ");
            System.out.println("Total "+inventoryService.calculateInventoryValue(products));
        System.out.println("    ");
        inventoryService.findLowStockProducts(products);
    }
}
