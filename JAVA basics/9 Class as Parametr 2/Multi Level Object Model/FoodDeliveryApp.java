class FoodDeliveryApp{
	String appName;
	double rating;
	Restaurant restaurant;
	FoodDeliveryApp(String appName,double rating,Restaurant restaurant){
		this.appName=appName;
		this.rating=rating;
		this.restaurant=restaurant;
		System.out.println("Inside constructor FoodDeliveryApp");
		
	}
	void displayFoodDeliveryApp(){
		System.out.println("App Name : "+appName);
		System.out.println("Rating : "+rating);
		restaurant.displayRestaurant();
		
	}
	
}