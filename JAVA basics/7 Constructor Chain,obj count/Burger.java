class Burger{
	
 	int burgerCount;
	String burgerName;
	int total;
	boolean isOpen;
	double price;
	static int count =0;
	
	Burger(){
		System.out.println("no args const");
	}
	
	Burger(int burgerCount , String burgerName,int total,boolean isOpen,double price){
		this(burgerCount,burgerName,total);
		this.price=price;	
		this.isOpen=isOpen;
		System.out.println("const with 5 parms");
		count++;
	}
	
	
	Burger(int burgerCount,String burgerName,int total){
		this(burgerCount,burgerName);
		this.total=total;
		System.out.println("const with 3 parms");
	}
	Burger(int burgerCount,String burgerName){
		this(burgerCount);
		this.burgerName=burgerName;
		System.out.println("const with 2 parms");
	}
	Burger(int burgerCount){
		this();
		this.burgerCount=burgerCount;
		System.out.println("const with 1 parms");
		
		
	}
	void display(){
		System.out.println("Burger count :"+burgerCount);
		System.out.println("Burger Name :"+burgerName);
		System.out.println("Burger total :"+total);
		System.out.println("Burger is open: "+isOpen);
		System.out.println("Burger price : "+price);
		System.out.println("Burger count: "+count);
		
	}	
}