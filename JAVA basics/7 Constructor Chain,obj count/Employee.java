class Employee{
	String employeeName;
	int employeeId;
	String department;
	String designation;
	double salary;
	int experience;
	String companyName;
	boolean isPermanent;
	String email;
	long phoneNumber;
	static int count=0;
     
	Employee(){
        System.out.println("Constructor with 0 parameters executed");
    }
    
    Employee(String employeeName,int employeeId){
        this(); 
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    Employee(String employeeName,int employeeId,
	String department){
        this(employeeName, employeeId);
        this.department=department;
        System.out.println("Constructor with 3 parameters executed");
    }
    
    Employee(String employeeName,int employeeId,
	String department,String designation,
	double salary){
        this(employeeName, employeeId,
         department);
        this.designation=designation;
        this.salary=salary;
        System.out.println("Constructor with 5 parameters executed");
    }

    Employee(String employeeName,int employeeId,
	String department,String designation,
	double salary,
	int experience,String companyName,
	boolean isPermanent){

        this(employeeName, employeeId,
         department, designation, salary);
        this.experience=experience;
        this.companyName=companyName;
        this.isPermanent=isPermanent;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Employee(String employeeName,int employeeId,
	String department,String designation,
	double salary,
	int experience,String companyName,
	boolean isPermanent,
	String email,long phoneNumber){

        this(employeeName, employeeId,
         department, designation, salary,experience,companyName,isPermanent);
        this.email=email;
        this.phoneNumber=phoneNumber;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	public void display(){
		System.out.println("EMPLOYEE DETAILS");
		System.out.println(employeeName);
		System.out.println(employeeId);
		System.out.println(department);
		System.out.println(designation);
		System.out.println(salary);
		System.out.println(experience);
		System.out.println(companyName);
		System.out.println(isPermanent);
		System.out.println(email);
		System.out.println(phoneNumber);
		System.out.println("Burger count: "+count);
    
    }
}