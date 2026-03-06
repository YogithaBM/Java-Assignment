class Address{
	String street;
	String pincode;
	DeliveryPartner deliveryPartner;
	Address(String street,String pincode,DeliveryPartner deliveryPartner){
		this.street=street;
		this.pincode=pincode;
		this.deliveryPartner=deliveryPartner;
		System.out.println("Inside constructor Address");
	}
	void displayAddress(){
		System.out.println("Street : "+street);
		System.out.println("Pincode : "+pincode);
		deliveryPartner.displayDeliveryPartner();
		
	}
}