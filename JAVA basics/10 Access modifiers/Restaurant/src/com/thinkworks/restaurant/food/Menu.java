package com.restaurant.food;

public class Menu {
    String menuType;
    int items;
    public Menu(String menuType,int items){
        this.menuType=menuType;
        this.items=items;
        checkMenu();
        checkItems();

    }
    private void checkMenu(){
        System.out.println("Menu Type : "+menuType);
    }
    private void checkItems(){
        System.out.println("Items Count : "+items);
    }

}
