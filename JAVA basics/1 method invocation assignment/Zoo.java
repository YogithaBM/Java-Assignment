class Zoo{
	static String zooName="PRAANII";
	static int headCount=3564;
	static boolean isOpen=true;
	static char zooGrade='A';
	static double zooFee=654.845d;
	
	public static void main(String[] args){
		displayWelcome();
		System.out.println("zooName= "+zooName);
		System.out.println("headCount= "+headCount);
		System.out.println("isOpen= "+isOpen);
		System.out.println("zooGrade= "+zooGrade);
		System.out.println("zooFee= "+zooFee);
		System.out.println("animalCount= "+animalCount());
		System.out.println("dailyIncome= "+dailyIncome());
		System.out.println("cleanlinessGrade= "+cleanlinessGrade());
		System.out.println("guideAvailable= "+guideAvailable());
		System.out.println("contactNum= "+contactNum());
		System.out.println("areaSize= "+areaSize());
		System.out.println("GateNum= "+GateNum());
		
		
		
	}
	public static int animalCount(){
		System.out.println("Running Method :animalCount");
		return 564534;
		
	}
	public static double dailyIncome(){
		System.out.println("Running Method :dailyIncome");
		return 6543.78547d;
	}
	public static char cleanlinessGrade(){
		System.out.println("Running Method:cleanlinessGrade");
		return 'A';	
	}	
	public static boolean guideAvailable(){
		System.out.println("Running Method:guideAvailable");
		return true;
	}
	public static long contactNum(){
		System.out.println("Running Method:contactNum");
		return 45345657l;
	}
	public static float areaSize(){
		System.out.println("Running Method:areaSize");
		return 45.67f;
		
	}
	public static byte GateNum(){
		System.out.println("Running Method:GateNum" );
		return 5;
	}
	public static void displayWelcome(){
		System.out.println("Running Method:displayWelcome");
		System.out.println("WELCOME TO PRAANI LAND");
	}
}