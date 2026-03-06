class Vehicle{
	String vehicleType;
	String vehicleNumber;
	Company company;
	Vehicle(String vehicleType,String vehicleNumber,Company company){
		this.vehicleType=vehicleType;
		this.vehicleNumber=vehicleNumber;
		this.company=company;
		System.out.println("Inside constructor Vehicle");
	}
	void displayVehicle(){
		System.out.println("Vehicle Type: "+vehicleType);
		System.out.println("Vehicle Number: "+vehicleNumber);
		company.displayCompany();
	}
}