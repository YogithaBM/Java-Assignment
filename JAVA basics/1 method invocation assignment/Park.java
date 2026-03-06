class Park{
	static boolean isPetAllowed=true;
	static int totalTrees=35534;
	static double entryFee=36.5475d;
	static String parkName="YoloMolo";
	static char parkGrade='Y';
	
	public static void main(String[] agrs){
		displayBoard();
		System.out.println("isPetAllowed= "+isPetAllowed);
		System.out.println("totalTrees= "+totalTrees);
		System.out.println("entryFee= "+entryFee);
		System.out.println("parkName= "+parkName);
		System.out.println("parkGrade= "+parkGrade);
		
		System.out.println("famousSpot= "+famousSpot());
		System.out.println("boatFare= "+boatFare());
		System.out.println("visitorCOunt= "+visitorCOunt());
		System.out.println("rideGrade= "+rideGrade());
		System.out.println("chidrenCount= "+chidrenCount());
		System.out.println("openStatus= "+openStatus());
		
	
	}
	public static String famousSpot(){
		System.out.println("Running Method:famousSpot");
		return "lake";
		
	}
	public static float boatFare(){
		System.out.println("Running Method:bostFare");
		return 50.23f;
	}
	public static long visitorCOunt(){
		System.out.println("Running Method:visitorCOunt");
		return 2345657l;
	}
	public static char rideGrade(){
		System.out.println("Running Method :rideGrade");
		return 'A';
	}
	public static int chidrenCount(){
		System.out.println("Running Method:chidrenCount");
		return 5673;	
	}
	public static boolean openStatus(){
		System.out.println("Running Method:openStatus");
		return false;
	}
	public static void displayBoard(){
		System.out.println("WELCOME TO YOLOMOLO");
	}

}