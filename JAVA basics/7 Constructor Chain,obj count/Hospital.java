class Hospital{

	String hospitalName;
	String location;
	int totalBeds;
	int availableBeds;
	int totalDoctors;
	String chiefDoctor;
	boolean hasEmergencyWard;
	double rating;
	String contactNumber;
	float consultationFee;
	static int count=0;
    
	Hospital(){
        System.out.println("Constructor with 0 parameters executed");
    }

    Hospital(String hospitalName,
	String location){
        this(); 
        this.hospitalName=hospitalName;
        this.location=location;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    Hospital(String hospitalName,
	String location,
	int totalBeds){
        this(hospitalName, location);
        this.totalBeds=totalBeds;
        System.out.println("Constructor with 3 parameters executed");
    }
	
    Hospital(String hospitalName,
	String location,
	int totalBeds,
	int availableBeds,
	int totalDoctors){
        this(hospitalName, location, totalBeds);
        this.availableBeds=availableBeds;
        this.totalDoctors=totalDoctors;
        System.out.println("Constructor with 5 parameters executed");
    }

    Hospital(String hospitalName,
	String location,
	int totalBeds,
	int availableBeds,
	int totalDoctors,
	String chiefDoctor,
	boolean hasEmergencyWard,
	double rating){

        this(hospitalName, location, totalBeds,availableBeds, totalDoctors);
        this.chiefDoctor=chiefDoctor;
        this.hasEmergencyWard=hasEmergencyWard;
        this.rating=rating;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Hospital(String hospitalName,
	String location,
	int totalBeds,
	int availableBeds,
	int totalDoctors,
	String chiefDoctor,
	boolean hasEmergencyWard,
	double rating,
	String contactNumber,
	float consultationFee){

        this(hospitalName, location, totalBeds,availableBeds, totalDoctors,chiefDoctor, hasEmergencyWard, rating);
        this.contactNumber=contactNumber;
        this.consultationFee=consultationFee;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	
    public void display(){
        System.out.println("HOSPITAL DETAILS ");

        System.out.println("hospitalName: "+hospitalName);
        System.out.println("location: "+location);
        System.out.println("totalBeds: "+totalBeds);
        System.out.println("availableBeds: "+availableBeds);
        System.out.println("totalDoctors: "+totalDoctors);
        System.out.println("chiefDoctor: "+chiefDoctor);
        System.out.println("hasEmergencyWard: "+hasEmergencyWard);
        System.out.println("rating: "+rating);
        System.out.println("contactNumber: "+contactNumber);
        System.out.println("consultationFee: "+consultationFee);
		System.out.println("Burger count: "+count);
    }
}