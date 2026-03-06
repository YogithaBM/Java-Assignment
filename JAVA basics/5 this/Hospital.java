class Hospital{
	String hospitalName;
	String location;
	int DocCount;
	int bedsCount;
	
	Hospital(String hospitalName,String location,int DocCount,int bedsCount){
		this.hospitalName=hospitalName;
		this.location=location;
		this.DocCount=DocCount;
		this.bedsCount=bedsCount;
		System.out.println("Name: "+this.hospitalName);
		System.out.println("Location: "+this.location);
		System.out.println("Doctors Count: "+this.DocCount);
		System.out.println("BedsCount: "+this.bedsCount);
		

		
	}

}