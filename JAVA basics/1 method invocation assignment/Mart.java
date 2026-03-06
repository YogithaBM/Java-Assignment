class Mart{
	static String markName="Seven Eleven";
	static long itemCount=3564927456l;
	static boolean isOpen=true;
	static char markGrade='B';
	static double gst=654.898d;
	
	
	public static void main(String[] args){
		displayOfferBoard();
	System.out.println("markName= "+markName);
	System.out.println("itemCount= "+itemCount);
	System.out.println("isOpen= "+isOpen);
	System.out.println("markGrade= "+markGrade);
	System.out.println("gst= "+gst);
	

	System.out.println("returntopItem= "+returntopItem());
	System.out.println("returnsalesCount= "+returnsalesCount());
	System.out.println("returndeliveryStatus= "+returndeliveryStatus());
	System.out.println("returnseviceGrade= "+returnseviceGrade());
	System.out.println("returncontactNumber= "+returncontactNumber());
	System.out.println("returndiscount= "+returndiscount());
	System.out.println("returnFloor= "+returnFloor());
	
	
	}
	public static String returntopItem(){
		System.out.println("Running Method :topItem");
		return "riceCake";
	}
	public static double returnsalesCount(){
		System.out.println("Running Method:salesCount");
		return 5432.454d;
	}
	public static boolean returndeliveryStatus(){
		System.out.println("Running Method:deliveryStatus");
		return true;
		
	}
	public static char returnseviceGrade(){
		System.out.println("Running Method:seviceGrade");
		return 'B';
	}
	public static long returncontactNumber(){
		System.out.println("Running Method :contactNmuber");
		return 364574534673l;
	}
	public static float returndiscount(){
		System.out.println("Running Method:discount");
		return 45.23f;
	}
	public static byte returnFloor(){
		System.out.println("Running Method");
		return 2;
	}
	public static void displayOfferBoard(){
		System.out.println("Running Method :displayOfferBoard");
		System.out.println("BUY 2 GET 1 ON WEDNESDAY");
		
	}
}