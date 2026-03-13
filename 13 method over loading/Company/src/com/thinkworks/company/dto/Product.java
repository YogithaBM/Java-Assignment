package com.thinkworks.company.dto;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantity;
    private String category;

    public Product(int productId,String productName,double price,int quantity,String category){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.category=category;
    }

    public void setProductId(int productId){

        this.productId=productId;
    }
    public int getProductId(){

        return productId;
    }
    public void setProductName(String productName){

        this.productName=productName;
    }
    public String getProductName(){

        return productName;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public int  getQuantity(){
        return quantity;
    }
    public void setCategory(String category){

        this.category=category;
    }
    public String getCategory() {
        return category;
    }

    public double calculateStockValue(){
        return (price * quantity);

    }

}
