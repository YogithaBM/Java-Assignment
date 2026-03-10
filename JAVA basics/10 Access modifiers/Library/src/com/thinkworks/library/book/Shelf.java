package com.library.book;

public class Shelf {
    private void checkShelf(int shelfNumber){
        System.out.println("Shelf : "+shelfNumber);
    }
    private void checkCountry(String country){
        System.out.println("Country : "+country);
    }
    public void displayShelf(int shelfNumber,String country){
        checkShelf(shelfNumber);
        checkCountry(country);

    }
}
