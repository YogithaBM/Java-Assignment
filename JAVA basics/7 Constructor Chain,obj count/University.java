class University{
	String universityName;
	String location;
	int establishedYear;
	int totalStudents;
	int totalCourses;
	String chancellorName;
	double ranking;
	boolean isPublic;
	String accreditation;
	double campusSize;
	static int count=0;
   
	University(){
        System.out.println("Constructor with 0 parameters executed");	
    }
   
    University(String universityName,String location){
        this(); 
        this.universityName=universityName;
        this.location=location;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    University(String universityName,String location,
	int establishedYear){
        this(universityName, location);
        this.establishedYear=establishedYear;
        System.out.println("Constructor with 3 parameters executed");
    }

    University(String universityName,String location,
	int establishedYear,
	int totalStudents,int totalCourses){
        this(universityName, location,
         establishedYear);
        this.totalStudents=totalStudents;
        this.totalCourses=totalCourses;
        System.out.println("Constructor with 5 parameters executed");
		
    }

    University(String universityName,String location,
	int establishedYear,
	int totalStudents,int totalCourses,
	String chancellorName,
	double ranking,boolean isPublic){

        this(universityName, location,
         establishedYear, totalStudents, totalCourses);
        this.chancellorName=chancellorName;
        this.ranking=ranking;
        this.isPublic=isPublic;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    University(String universityName,String location,
	int establishedYear,
	int totalStudents,int totalCourses,
	String chancellorName,
	double ranking,boolean isPublic,
	String accreditation,double campusSize){

        this(universityName, location,
         establishedYear, totalStudents,totalCourses,chancellorName,ranking,isPublic);

        this.accreditation=accreditation;
        this.campusSize=campusSize;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	public void display(){
		System.out.println("UNIVERSITY DETAILS");
		System.out.println(universityName);
		System.out.println(location);
		System.out.println(establishedYear);
		System.out.println(totalStudents);
		System.out.println(totalCourses);
		System.out.println(chancellorName);
		System.out.println(ranking);
		System.out.println(isPublic);
		System.out.println(accreditation);
		System.out.println(campusSize);
		System.out.println("Burger count: "+count);
    
	}
}