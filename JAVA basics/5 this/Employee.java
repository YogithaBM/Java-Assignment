class Employee{
	String empName;
	int empID;
	String department;
	double salary;
	
	
	Employee(String empName,int empID,String department,double salary){
		this.empName=empName;
		this.empID=empID;
		this.department=department;
		this.salary=salary;
		System.out.println("Name: "+this.empName);
		System.out.println("Employee ID: "+this.empID);
		System.out.println("Department: "+this.department);
		System.out.println("salary: "+this.salary);
	

		
	}

}