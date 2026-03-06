class Region {
	
	String regionName; 
	String country; 
	Device device;
	
	Region(String regionName, String country, Device device){
		if (device!=null){
		this.regionName=regionName; 
		this.country=country;
		this.device=device;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	
	void displayRegion(){
		System.out.println("regionName :"+regionName);
		System.out.println("country: "+country);
		device.displayDevice();
		 
		 
	}

}