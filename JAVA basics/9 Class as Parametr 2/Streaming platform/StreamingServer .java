class StreamingServer {
	String serverId;
	String location; 
	CDN cdn;
	StreamingServer(String serverId, String location, CDN cdn){
		if (cdn!=null){
		this.serverId=serverId;
		this.location=location;
		this.cdn=cdn;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	void displayStreamingServer(){
		System.out.println("serverId :"+serverId);
		System.out.println("location :"+location);
		cdn.displayCDN();
		
		
		
	}

}