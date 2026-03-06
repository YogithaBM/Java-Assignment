class Mall {
	static String markName="SOPRITE";
	static long itemCount=345246l;
	static boolean isOpen=false;
	static char markGrade='A';
	static double gst=3545.68d;
	
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
		return "TOYS";
	}
	public static double returnsalesCount(){
		System.out.println("Running Method:salesCount");
		return 56456767.566d;
	}
	public static boolean returndeliveryStatus(){
		System.out.println("Running Method:deliveryStatus");
		return false;
		
	}
	public static char returnseviceGrade(){
		System.out.println("Running Method:seviceGrade");
		return 'B';
	}
	public static long returncontactNumber(){
		System.out.println("Running Method :contactNmuber");
		return 7687894l;
	}
	public static float returndiscount(){
		System.out.println("Running Method:discount");
		return 3545.45f;
	}
	public static byte returnFloor(){
		System.out.println("Running Method");
		return 7;
	}
	public static void displayOfferBoard(){
		System.out.println("Running Method :displayOfferBoard");
		System.out.println("WELCOME TO SOPRITE");
		
	}
	
}