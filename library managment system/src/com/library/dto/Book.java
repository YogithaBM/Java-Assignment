package com.library.dto;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;
    private int stock;
    private BookCategory category;

    public Book(int bookId, String title, String author, double price, int stock, BookCategory category) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.category = category;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public double calculateStockValue() {

        return price * stock;
    }

    static {
        System.out.println("Library System Initialized");
    }

    {
        System.out.println("Book object created");
    }


}
