class MainRunner{
	public static void main(String [] args){
	Company company=new Company("YOLOMOLO","Bangalore",23);
	Vehicle vehicle =new Vehicle("Bike","hd8364jbd83",company);
	DeliveryPartner deliveryPartner=new DeliveryPartner("Yami",4,vehicle);
	Address address =new Address("Food Street","560034",deliveryPartner);
	Customer customer=new Customer("Komi","45638",address);
	Order order=new Order(74,5486.435d,customer);
	FoodItem foodItem =new FoodItem("Biryani",685.47d,order);
	Menu menu =new Menu("Eat everything",54,foodItem);
	Restaurant restaurant=new Restaurant("Bombat Boojana","South indian",menu);
	FoodDeliveryApp foodDeliveryApp=new FoodDeliveryApp("Food Pagalu",4.9d,restaurant);
	foodDeliveryApp.displayFoodDeliveryApp();
	}
}