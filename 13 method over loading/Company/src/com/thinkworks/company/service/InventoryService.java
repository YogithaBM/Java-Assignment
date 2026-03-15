package com.thinkworks.company.service;

import com.thinkworks.company.dto.Customer;
import com.thinkworks.company.dto.Order;
import com.thinkworks.company.dto.Product;

public class InventoryService {
    public static final String COMPANY_NAME="SHIN CHAN";
    public void printProductDetails(Product product){
        System.out.println("Product Id : "+product.getProductId());
        System.out.println("Product Name : "+product.getProductName());
        System.out.println("Price : "+product.getPrice());
        System.out.println("Quantity : "+product.getQuantity());
        System.out.println("Category : "+product.getCategory());
    }
    public void printCustomerDetails(Customer customer){
        System.out.println("ID : "+customer.getCustomerId());
        System.out.println("Email : "+customer.getEmail());
        System.out.println("Name : "+customer.getName());
        System.out.println("Phone Number : "+customer.getPhone());
    }
    public void printOrderDetails(Order order){
        System.out.println("Customer Name : "+order.getCustomer().getName());
        Product[] products= order.getProducts();
        System.out.println("Product List : ");
        for(Product product:products) {
            System.out.println(product.getProductName());
        }
        System.out.println("Total = "+order.calculateOrderValue());
    }
    public double calculateInventoryValue(Product[] products){
        double total=0;
        for(Product product: products ){
            total+=product.calculateStockValue();

        }
        return total;
    }
    public void findLowStockProducts(Product[] products){
        for(Product product:products){
            if (product.getQuantity()<5){
                System.out.println("Low stock products"+product.getProductName());
            }
        }
    }





}
