class Car{
	
    String brand;
    String model;
    int year;
    String fuelType;
    float price ;
    String colour;
    boolean isAutomatic;
    double engineCapacity;
    int saetingcapacity;
    String registrationNumber;
	static int count=0;
    Car(){
        System.out.println("Constructor with 0 parameters executed");
    }
    
    Car(String brand,String model){
        this(); 
        this.brand=brand;
        this.model=model;
        System.out.println("Constructor with 2 parameters executed");
    }

    Car(String brand,String model,int year){
        this(brand,model);
        this.year=year;
        System.out.println("Constructor with 3 parameters executed");
    }
    
    Car(String brand,String model,int year,String fuelType,float price){
        this(brand,model,year);
        this.fuelType=fuelType;
        this.price=price;
        System.out.println("Constructor with 5 parameters executed");
    }

    Car(String brand,String model,int year,
    String fuelType,float price ,String colour,
    boolean isAutomatic,double engineCapacity){

        this(brand,model,year,fuelType,price);
        this.colour=colour;
        this.isAutomatic=isAutomatic;
        this.engineCapacity=engineCapacity;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Car(String brand,String model,int year,
    String fuelType,float price ,String colour,
    boolean isAutomatic,double engineCapacity,
    int saetingcapacity,String registrationNumber){

        this(brand,model,year,fuelType,price,colour,isAutomatic,engineCapacity);
        this.registrationNumber=registrationNumber;
        this.saetingcapacity=saetingcapacity;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	
    public void display(){
        System.out.println("CAR DETAILS");

        System.out.println("brand: "+brand);
        System.out.println("model: "+model);
        System.out.println("year: "+year);
        System.out.println("fuelType: "+fuelType);
        System.out.println("price: "+price);
        System.out.println("colour: "+colour);
        System.out.println("isAutoamtic: "+isAutomatic);
        System.out.println("engineCapacity: "+engineCapacity);
        System.out.println("saetingcapacity: "+saetingcapacity);
        System.out.println("registrationNumber: "+registrationNumber);
		System.out.println("Burger count: "+count);
    }
}