class Laptop{
	String brand;
	String processor;
	int ram;
	int storage;
	float price;
	String os;
	boolean isTouchScreen;
	double screenSize;
	String colour;
	int warrantyYears;
	static int count=0; 
	
	Laptop(){
		
		System.out.println("Constructor with zero parameters executed");
	}
	Laptop(String brand,String processor){
		this();
		System.out.println("Constructor with 2 parameters executed");
		this.brand=brand;
		this.processor=processor;
		
	}
	Laptop(String brand,String processor,int ram){
		this(brand,processor);
		this.ram=ram;
		System.out.println("Constructor with 3 parameters executed");
		
	}
	Laptop(String brand,String processor,int ram,int storage,
	float price){
		this(brand,processor,ram);
		this.storage=storage;
		this.price=price;
		System.out.println("Constructor with 5 parameters executed");
		
	}
	
	Laptop(String brand,String processor,int ram,int storage,
	float price,String os,
	boolean isTouchScreen,double screenSize){
		this(brand,processor,ram,storage,price);
		this.storage=storage;
		this.price=price;
		this.os=os;
		System.out.println("Constructor with 8 parameters executed");
		count++;
	}
	
	Laptop(String brand,String processor,int ram,int storage,
	float price,String os,
	boolean isTouchScreen,double screenSize,
	String colour,int warrantyYears){
		this(brand,processor,ram,storage,price,os,isTouchScreen,screenSize);
		this.colour=colour;
		this.warrantyYears=warrantyYears;
		
		System.out.println("Constructor with 10 parameters executed");
		
		
	}
	
	public void display(){
	System.out.println("LAPTOP DETAILS");
	System.out.println("brand = "+brand);
	System.out.println("processor = "+processor);
	System.out.println("ram = "+ram);
	System.out.println("storage = "+storage);
	System.out.println("price = "+price);
	System.out.println("OS = "+os);
	System.out.println("isTouchScreen = "+isTouchScreen);
	System.out.println("screenSize = "+screenSize);
	System.out.println("colour = "+colour);
	System.out.println("warrantyYears = "+warrantyYears);
	System.out.println("Burger count: "+count);
	
	
	}	
	
}