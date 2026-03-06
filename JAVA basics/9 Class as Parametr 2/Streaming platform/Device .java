class Device {
	String deviceType; 
	String os;
	InternetProvider internetProvider;
	
	
	Device(String deviceType, String os, InternetProvider internetProvider){
		if (internetProvider!=null){
		 this.deviceType=deviceType;
		 this.os=os; 
		 this.internetProvider=internetProvider;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	void displayDevice(){
		System.out.println("deviceType :"+deviceType);
		System.out.println("os :"+os);
		internetProvider.displayInternetProvider();
	}

}