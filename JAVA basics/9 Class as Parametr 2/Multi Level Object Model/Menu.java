class Menu{
	String menuType;
	int totalItems;
	FoodItem foodItem;
	
	Menu(String menuType,int totalItems,FoodItem foodItem){
		this.menuType=menuType;
		this.totalItems=totalItems;
		this.foodItem=foodItem;
		System.out.println();
	}
	
	void displayMenu(){
		System.out.println("Menu Type : "+menuType);
		System.out.println("Total Items : "+totalItems);
		foodItem.displayFoodItem();
	}
}