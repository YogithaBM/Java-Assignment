class Mobile{
	
	String brand;
	String model;
	float price;
	int storage;
	int ram;
	int batteryCapacity;
	int cameraMP;
	boolean has5G;
	String color;
	double screenSize;
	static int count=0;

	Mobile(){
        System.out.println("Constructor with 0 parameters executed");
    }
    
    Mobile(String brand,String model){
        this(); 
        this.brand=brand;
        this.model=model;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    Mobile(String brand,String model,float price){
        this(brand, model);
        this.price=price;
        System.out.println("Constructor with 3 parameters executed");
    }
    
    Mobile(String brand,String model,float price,
	int storage,int ram){
        this(brand, model, price);
        this.storage=storage;
        this.ram=ram;
        System.out.println("Constructor with 5 parameters executed");
    }

    Mobile(String brand,String model,float price,
	int storage,int ram,int batteryCapacity,int cameraMP,
	boolean has5G){

        this(brand, model, price, storage, ram);
        this.batteryCapacity=batteryCapacity;
        this.cameraMP=cameraMP;
        this.has5G=has5G;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Mobile(String brand,String model,float price,
	int storage,int ram,int batteryCapacity,int cameraMP,
	boolean has5G,
	String color,
	double screenSize){

        this(brand, model, price, storage, ram,batteryCapacity,cameraMP,has5G);
        this.color=color;
        this.screenSize=screenSize;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	
	public void display(){
    System.out.println("Mobile Details");
    System.out.println("Brand: "+brand);
    System.out.println("Model: "+model);
    System.out.println("Price: "+price);
    System.out.println("Storage: "+storage);
    System.out.println("RAM: "+ram);
    System.out.println("Battery Capacity: "+batteryCapacity);
    System.out.println("Camera: "+cameraMP);
    System.out.println("5G Supported: "+has5G);
    System.out.println("Color: "+color);
    System.out.println("Screen Size: "+screenSize);
	System.out.println("Burger count: "+count);
	}
}