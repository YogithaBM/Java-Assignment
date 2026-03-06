class FoodItem{
	String itemName;
	double price;
	Order order;
	
	FoodItem(String itemName,double price,Order order){
		this.itemName=itemName;
		this.price=price;
		this.order=order;
		
		System.out.println("Inside constructor FoodItem");
		
	}
	void displayFoodItem(){
		System.out.println("Item Name : "+itemName);
		System.out.println("Price : "+price);
		order.displayOrder();
		
		
	}
}