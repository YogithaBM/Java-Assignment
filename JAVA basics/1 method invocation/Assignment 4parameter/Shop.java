class Shop{
	public static void item(String name){
		System.out.println("name: "+name);
	}
	
	public static void sale(int qty,double price,String type ){
		System.out.println("Quantity: "+qty+"price :"+price+"type: "+type);
	}
	
	public static void bill(String name,int qty,double total){
		System.out.println("Name: "+name+"Quantity: "+qty+"total: "+total);
	}
	
	public static void stock (String name,int qty,double cost ,boolean avail){
		System.out.println("name: "+name+"Quantity: "+qty+"Cost: "+cost+"available?: "+avail);
	}
	
	public static void ship(String name,int qty,double fee,String city){
		System.out.println("Name: "+name+"quantity: "+qty+"Fee: "+fee+"City"+city);
	}
	

}