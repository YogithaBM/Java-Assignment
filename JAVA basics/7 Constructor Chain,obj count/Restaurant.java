class Restaurant{
	String restaurantName;
	String location;
	String cuisineType;
	float rating;
	boolean isVegOnly;
	int seatingCapacity;
	double averageCost;
	String ownerName;
	String contactNumber;
	boolean homeDelivery;
	static int count=0;
 
	Restaurant(){
        System.out.println("Constructor with 0 parameters executed");
    }
    
    Restaurant(String restaurantName,String location){
        this(); 
        this.restaurantName=restaurantName;
        this.location=location;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    Restaurant(String restaurantName,String location,String cuisineType){
        this(restaurantName, location);
        this.cuisineType=cuisineType;
        System.out.println("Constructor with 3 parameters executed");
    }
    
    Restaurant(String restaurantName,String location,String cuisineType,float rating,boolean isVegOnly){
        this(restaurantName, location,cuisineType);
        this.rating=rating;
        this.isVegOnly=isVegOnly;
        System.out.println("Constructor with 5 parameters executed");
    }

    Restaurant(String restaurantName,String location,String cuisineType,
	float rating,boolean isVegOnly,int seatingCapacity,double averageCost,
	String ownerName){

        this(restaurantName, location,
         cuisineType, rating, isVegOnly);
        this.seatingCapacity=seatingCapacity;
        this.averageCost=averageCost;
        this.ownerName=ownerName;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Restaurant(String restaurantName,String location,String cuisineType,
	float rating,boolean isVegOnly,
	int seatingCapacity,double averageCost,String ownerName,
	String contactNumber,boolean homeDelivery){

        this(restaurantName, location,
         cuisineType, rating, isVegOnly,seatingCapacity,averageCost,ownerName);
        this.contactNumber=contactNumber;
        this.homeDelivery=homeDelivery;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	public void display() {
	System.out.println("RESTAURANT DETAILS");
    System.out.println(restaurantName);
    System.out.println(location);
    System.out.println(cuisineType);
    System.out.println(rating);
    System.out.println(isVegOnly);
    System.out.println(seatingCapacity);
    System.out.println(averageCost);
    System.out.println(ownerName);
    System.out.println(contactNumber);
    System.out.println(homeDelivery);
	System.out.println("Burger count: "+count);
}
	
    
}