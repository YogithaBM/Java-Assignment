package com.library.book;

public class Book {
    private void author(String authorName){
        System.out.println("Author Name : "+authorName);
    }
    private void topSeller(String topSellerName){
        System.out.println("Top Seller : "+topSellerName);
    }
    public void displayBook(String authorName,String topSellerName){
        author(authorName);
        topSeller(topSellerName);
        System.out.println("About the Book");

    }
}
