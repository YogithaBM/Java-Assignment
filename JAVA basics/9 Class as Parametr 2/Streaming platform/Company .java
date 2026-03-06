class Company{
	String companyName;
	String headquarters; 
	int employees;
	
	Company(String companyName,String headquarters,int employees){
		this.companyName=companyName;
		this.headquarters=headquarters;
		this.employees=employees;
	}
	void displayCompany(){
		System.out.println("companyName:"+companyName);
		System.out.println("headquarters: "+headquarters);
		System.out.println("employees: "+employees);
		
	}
} 