class Student{

    String studentName;
	int rollNumber;
    int age;
    String gender;
    String course;
    String department;
    float cgpa;
    String  collageName;
    long phoneNumber;
    String email ;
	static int count=0;
 
	Student(){
        System.out.println("Constructor with 0 parameters executed");
    }

    Student(String studentName,
	int rollNumber){
        this(); 
        this.rollNumber=rollNumber;
        this.studentName=studentName;
        System.out.println("Constructor with 2 parameters executed");
    }

    Student(String studentName,
	int rollNumber,
    int age){
        this(studentName,rollNumber);
        this.age=age;
        System.out.println("Constructor with 3 parameters executed");
    }


    
    Student(String studentName,
	int rollNumber,
    int age,
    String gender,
    String course){
        this(studentName,rollNumber,age);
        this.course=course;
        this.gender=gender;
        System.out.println("Constructor with 5 parameters executed");
    }

    Student(String studentName,
	int rollNumber,
    int age,
    String gender,
    String course,
    String department,
    float cgpa,
    String  collageName){

        this(studentName,rollNumber,age,gender,course);
        this.department=department;
        this.cgpa=cgpa;
        this.collageName=collageName;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Student(String studentName,
	int rollNumber,
    int age,
    String gender,
    String course,
    String department,
    float cgpa,
    String  collageName,
    long phoneNumber,
    String email){

        this(studentName,rollNumber,age,gender,course,department,cgpa,collageName);
        this.phoneNumber=phoneNumber;
        this.email=email;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	
    public void display(){
        System.out.println(" STUDENT DEATILS");

        System.out.println("studentName: "+studentName);
        System.out.println("age: "+age);
        System.out.println("gender: "+gender);
        System.out.println("rollNumber: "+rollNumber);
        System.out.println("course: "+course);
        System.out.println("department: "+department);
        System.out.println("cgpa: "+cgpa);
        System.out.println("collageName: "+collageName);
        System.out.println("phoneNumber: "+phoneNumber);
        System.out.println("email: "+email);
		System.out.println("Burger count: "+count);
    }
}