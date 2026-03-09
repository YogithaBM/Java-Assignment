package com.restaurant.food;

public class Drink {
    String drinkName;
    int drinkCount;
   public Drink(String drinkName,int drinkCount){
       this.drinkName =drinkName;
       this.drinkCount=drinkCount;
       checkDrink();
       drinkChoice();
    }
    private void checkDrink(){
        System.out.println("Drink Name : "+drinkName);
    }
    private void drinkChoice(){
        System.out.println("Drink Count : "+drinkCount);

    }


}
