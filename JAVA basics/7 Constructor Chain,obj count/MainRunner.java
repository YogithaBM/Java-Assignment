class MainRunner{
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(
                "Dell","i7",16,512,73.35f,
                "Windows 11",true,15.4536d,
                "Black",2);

        if(laptop1!= null){
            laptop1.display();
            System.out.println(" ");
        }
		else{ 
            System.out.println("Object laptop1 is null");
        }
        Laptop laptop2 = new Laptop("HP","i5",8,256,55.35f,"Windows 10",false,14.6534d,"Silver",5);

        if(laptop2 != null){
            laptop2.display();
            System.out.println(" ");
        } 
		else {
            System.out.println("Object laptop2 is null");
		}
		
        Student student1 = new Student( "Hayle",145,2453,"Female","BE",
                "CSE",8.545f,"ASC College",9876543210l,"rahul@gmail.com");
        if(student1!= null){
            student1.display();
            System.out.println(" ");
        } 
		else {
            System.out.println("Object student1 is null");
        }
		
        Student student2 = new Student("Ananya",1634,15,"Female","Btech",
                "ECE",83.9546f,"BMS College",9123456780l,"ananya@gmail.com");
        if(student2!= null){
            student2.display();
            System.out.println(" ");
        } 
		else {
            System.out.println("Object student2 is null");
        }
		
        Car car1 = new Car("Toyota","Fortuner",2023,"Diesel",35.325f,
                "Black",true,234.83423d,7,"KA01AB1234");

        if(car1!= null){
            car1.display();
            System.out.println(" ");
        } 
		else {
            System.out.println("Object car1 is null");
        }

        Car car2 = new Car("Honda","City",2022,"Petrol",14.35f,"White",false,1342.534d,5,"KA05CD5678");
        if(car2!= null){
            car2.display();
            System.out.println(" ");
        }
		else {
            System.out.println("Object car2 is null");
        }

		Hospital hospital1 = new Hospital("Apollo","Bengaluru",5455,124,84,"Dr. Sharma",true,43.6d, "8012345678",75.345f);

		if(hospital1 != null){
		hospital1.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object hospital1 is null");
		}

		Hospital hospital2 = new Hospital("City Care","Mysuru",2342,63423,334,
        "Dr. Rao",true,44.2453d, "8123456789",54.45f);

		if(hospital2!= null){
			hospital2.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object hospital2 is null");
		}

		Mobile mobile1 = new Mobile("Samsung","S23",85.56f,256,12,575,108,true, "Black",6.57d);

		if(mobile1 != null){
		mobile1.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object mobile1 is null");
		}

		Mobile mobile2 = new Mobile("Apple","iPhone 14",95.523f,128,6,
        445,48,true, "Blue",6.1875d);

		if(mobile2!= null){
		mobile2.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object mobile2 is null");
		}
		
		BankAccount bank1 = new BankAccount("Ravi",123456789L,"SBI","MG Road",534.34d,"Savings",true,
        "SBIN0001234","Kiran","9876543210");

		if(bank1 != null){
		bank1.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object bank1 is null");
		}

		BankAccount bank2 = new BankAccount("Meena",9876543213l,"HDFC","Indiranagar",
        75034.23d,"Current",true,"HDFC0005678","Arun","9123456780");

		if(bank2 != null){
		bank2.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object bank2 is null");
		}

		University university1 = new University("VTU","Belagavi",1995,25445,25,
        "Dr. X",434.3d,true, "NAAC A+",5455.34d);

		if(university1!= null){
		university1.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object university1 is null");
		}

		University university2 = new University("MIT","Manipal",1957,15054,18,
        "Dr. Y",48.346d,false, "NAAC A++",33.45d);

		if(university2 != null){
		university2.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object university2 is null");
		}

		Movie movie1 = new Movie("KGF","Prashanth Neel","Vijay",2018,
        "Action",8.5f,10.45d,true,150,"Kannada");

		if(movie1 != null){
		movie1.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object movie1 is null");
		}

		Movie movie2 = new Movie("Inception","Christopher Nolan","Emma",
		2018,"Sci-Fi",9.0f,160.0,true,148,"English");
		if(movie2 != null){
		movie2.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object movie2 is null");
		}
		
        Restaurant restaurant1 = new Restaurant("Spice Garden","Bengaluru","South Indian",
                44.57f,false,129,3545.4535d,"Ramesh","987654321",true);
        if(restaurant1!= null){
            restaurant1.display();
            System.out.println(" ");
        } 
		else {
            System.out.println("Object restaurant1 is null");
        }

        Restaurant restaurant2 = new Restaurant("Food Palace","Mysuru","North Indian",43.253f,true,80,25.453d,"Suresh", "9123456780",true );
        if(restaurant2 != null){
            restaurant2.display();
            System.out.println(" ");
        }
		else {
            System.out.println("Object restaurant2 is null");
        }

		Employee employee1 = new Employee("Arjun",143,"IT","Developer",
        634.23d,33,"Infosys",true,"arjun@gmail.com",9876543210L);
		if(employee1 != null){
		employee1.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object employee1 is null");
		}

		Employee employee2 = new Employee( "Sneha",134,"HR","Manager",
        8023.34d,56,"TCS",true,"sneha@gmail.com",9123456780L);
		if(employee2!= null){
		employee2.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object employee2 is null");
		}
		
		Book book1 = new Book( "Java Basics","James","Oracle",2020,
        534.34d,3554,"Programming",true,"2345678s90","English");

		if(book1 != null){
		book1.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object book1 is null");
		}

		Book book2 = new Book("DSA Guide","Mark","TechPub",2022,
        65433.34d,426,"Education",true,"9876s543f21","English");
		if(book2 != null){
		book2.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object book2 is null");
		}
		

		Flight flight1 = new Flight("AI101","Air India","Delhi","London",
        5503.45d,9,true,3076,58,"10:00 AM");
		if(flight1 != null){
		flight1.display();
		System.out.println(" ");
		} 
		else {
		System.out.println("Object flight1 is null");
		}

		Flight flight2 = new Flight("6E202","Indigo","Bengaluru","Mumbai",
        504.45d,2,false,189,25,"6:00 PM");

		if(flight2 != null){
		flight2.display();
		System.out.println(" ");
		}
		else {
		System.out.println("Object flight2 is null");
		}
		
		Camera camera1=new Camera("Sony","Sony A7R",61,true,374.45d,"mirror less",34,false,"Green",34);
		if (camera1!=null){
		camera1.display();
		System.out.println("  ");
		}
		else{
		System.out.println("Object camera1 is null");
		}
		
		Camera camera2=new Camera("Canon","EOS R5",43,false,34.242d,"mirrorless",45,true,"Red",56);
		if(camera2!=null){
		camera2.display();
		System.out.println("  ");
		}
		else {
			System.out.println("Object camera2 in null");
		}
		
		Burger burger1=new Burger(43,"Cilli Chicken Burger",34223,true,343.34d);
		if (burger1 !=null){
			burger1.display();
			System.out.println("  ");
			
		}
		else{
			System.out.println("Object burger1 is null");
		}
		Burger burger2=new Burger(34,"Veg Burger",34523,false,34.54d);
		if (burger2!=null){
			burger2.display();
			System.out.println("  ");
			
		}
		else{
			System.out.println("Object burger2 is null");
		}
		

    }
}

