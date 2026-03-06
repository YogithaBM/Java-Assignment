class Camera{
	
	String brand;
	String model;
	int megapixels;
	boolean isDSLR;
	double price;
	String lensType;
	int batteryLife;
	boolean hasWiFi;
	String color;
	double weight;
	static int count=0;
	
	Camera(){
		System.out.println("Constructor with 0 parameters executed");
	}
	Camera(String brand,String model){
		this();
		System.out.println("Constructor with 2 parameters executed");
		this.brand=brand;
		this.model=model;
		
	}
	Camera(String brand,String model,int megapixels){
		this(brand,model);
		System.out.println("Constructor with 3 parameters executed");
		this.megapixels=megapixels;
	}
	Camera(String brand,String model,int megapixels,
	boolean isDSLR,double price){
		this(brand,model,megapixels);
		System.out.println("Constructor with 5 parameters executed");
		this.isDSLR=isDSLR;
		this.price=price;
		
	}	
	Camera(String brand,String model,
	int megapixels,boolean isDSLR,double price,
	String lensType,int batteryLife,boolean hasWiFi){
		this(brand,model,megapixels,isDSLR,price);
		System.out.println("Constructor with 8 parameters executed");
		this.lensType=lensType;
		this.batteryLife=batteryLife;
		this.hasWiFi=hasWiFi;
	}
	Camera(String brand,String model,int megapixels,boolean isDSLR,double price,
	String lensType,int batteryLife,boolean hasWiFi,String color,double weight){
		this(brand,model,megapixels,isDSLR,price,lensType,batteryLife,hasWiFi);
		System.out.println("Constructor with 10 parameters executed");
		this.color=color;
		this.weight=weight;
		count++;
	}
	
	public void display(){

    System.out.println("CAMERA DETAILS");
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Megapixels: " + megapixels);
    System.out.println("DSLR: " + isDSLR);
    System.out.println("Price: " + price);
    System.out.println("Lens Type: " + lensType);
    System.out.println("Battery Life: " + batteryLife);
    System.out.println("WiFi: " + hasWiFi);
    System.out.println("Color: " + color);
    System.out.println("Weight: " + weight+"kg");
	System.out.println("Burger count: "+count);
}
	
}