class DataCenter {
	String dataCenterName;
	int serverCount; 
	Region region;
	
	DataCenter(String dataCenterName, int serverCount, Region region){
		if (region!=null){
		this.dataCenterName=dataCenterName;
		this.serverCount=serverCount; 
		this.region=region;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	void displayDataCenter(){
		System.out.println("dataCenterName :"+dataCenterName);
		System.out.println("serverCount :"+serverCount);
		region.displayRegion();
		
	}
}