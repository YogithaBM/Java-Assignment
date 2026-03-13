package com.thinkworks.company.service;

import com.thinkworks.company.dto.Customer;
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
    



}
