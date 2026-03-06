class CDN {
	String providerName; 
	int nodeCount; 
	DataCenter dataCenter;
	CDN(String providerName,int nodeCount,DataCenter dataCenter){
		if (dataCenter!=null){
		this.providerName=providerName;
		this.nodeCount=nodeCount;
		this.dataCenter=dataCenter;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
		
	}
	void displayCDN(){
		System.out.println("providerName : "+providerName);
		System.out.println("nodeCount: "+nodeCount);
		dataCenter.displayDataCenter();
		
	}
}