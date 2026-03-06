class Company{
	String companyName;
	String headQuarters;
	int employees;
	Company(String companyName,String headQuarters,int employees){
		this.companyName=companyName;
		this.headQuarters=headQuarters;
		this.employees=employees;
		System.out.println("inside constructor Company");
	}
	void displayCompany(){
		System.out.println("Company Name: "+companyName);
		System.out.println("Employees : "+employees);
		System.out.println("Head Quarters: "+headQuarters);
		
	}

}