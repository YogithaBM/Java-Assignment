class InternetProvider {
	String providerName; 
	int speedMbps; 
	Company company;
	
	InternetProvider(String providerName,int speedMbps, Company company){
		if (company!=null){
		this.providerName=providerName;
		this.speedMbps=speedMbps;
		this.company=company;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	void displayInternetProvider(){
		System.out.println("providerName: "+providerName);
		System.out.println("speedMbps: "+speedMbps);
		company.displayCompany();
		
	}
	
	
}