package com.shopping.product;

public class Category {
    private void checkCategory(String category){
        System.out.println("Category : "+category);
    }
    private void validateCategory(String category){
        System.out.println("Validate Category: "+category);
    }
    public void showCategory(String category){
        checkCategory(category);
        validateCategory(category);
        System.out.println("Show Category");
    }
}
