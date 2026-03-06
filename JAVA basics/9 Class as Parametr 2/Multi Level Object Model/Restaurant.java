class Restaurant{
	String restaurantName;
	String cuisineType;
	Menu menu;
	Restaurant(String restaurantName,String cuisineType,Menu menu){
		this.restaurantName=restaurantName;
		this.cuisineType=cuisineType;
		this.menu=menu;
		System.out.println("Inside constructor Restaurant");
		
	}
	void displayRestaurant(){
		System.out.println("Restaurant Name : "+restaurantName);
		System.out.println("CuisineType : "+cuisineType);
		menu.displayMenu();
		
	}
	

}