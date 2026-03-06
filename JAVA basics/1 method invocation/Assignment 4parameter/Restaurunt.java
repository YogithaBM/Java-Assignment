class Restaurunt{
	public static void printname(String itemName){
		System.out.println("Menu Item: "+itemName);
	}
	public static void takeOver(String customer,String item,int quantity){
		System.out.println("customer: "+"item: "+item+"quantity: "+quantity);
	}
	public static void cancelOrder(String customer,String item,int quantity){
		System.out.println("customer: "+customer+"item: "+"quantity: "+quantity);
	}
	public static void addItem(String item,double price,String category,int stock){
		System.out.println("item: "+item+"price: "+price+"category: "+category+"stock: "+stock);
	}
	public static void updateItem(String item,double price,String category,float discount){
		System.out.println("item: "+item+"price: "+price+"category: "+category+"discount: "+discount);
		
	}
}