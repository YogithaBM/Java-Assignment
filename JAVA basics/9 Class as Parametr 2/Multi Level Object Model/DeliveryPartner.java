class DeliveryPartner{
	String partnerName;
	int experienceYears;
	Vehicle vehicle;
	
	DeliveryPartner(String partnerName,int experienceYears,Vehicle vehicle){
		this.partnerName=partnerName;
		this.experienceYears=experienceYears;
		this.vehicle=vehicle;
		
		System.out.println("Inside counstructor DeliveryPartner");
		
	}
	void displayDeliveryPartner(){
		System.out.println("Partner Name : "+partnerName);
		System.out.println("Experience Years : "+experienceYears);
		vehicle.displayVehicle();
		
		
	}

}