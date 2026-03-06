class Gym{
	static boolean isActive =true;
	static String gymName="cult";
	static  char gymGrade='B';
	static short trainerCount=6;
	static int establishedIn=2016;
	
	public static void main(String[] args ){
		
		System.out.println("isActive= "+isActive);
		System.out.println("gymName= "+gymName);
		System.out.println("gymGrade= "+gymGrade);
		System.out.println("trainerCount= "+trainerCount);
		System.out.println("establishedIn= "+establishedIn);
		
		System.out.println("coachName= "+coachName());
		System.out.println("memberCount= "+memberCount());
		System.out.println("returnFloor= "+returnFloor());
		System.out.println("discount= "+discount());
		System.out.println("equipmentCount= "+equipmentCount());
		System.out.println("totalEarning= "+totalEarning());
		System.out.println("equipmentGrade= "+equipmentGrade());
		System.out.println("isOpen= "+isOpen());
		
		
		
	}
	
	public static String coachName(){
		System.out.println("Running Method:coachName");
		return "Sandy";
		
	}
	public static int memberCount(){
		System.out.println("Running Method:memberCount");
		return 4235;
	}
	public static byte returnFloor(){
		System.out.println("Running Method:returnFloor");
		return 3;
		
	}
	public static float discount(){
		System.out.println("Running Method:discount");
		return 36.23f;
	}
	public static short equipmentCount(){
		System.out.println("Running Method:equipment");
		return 58;
		
	}
	public static double totalEarning(){
		System.out.println("Running Method :totalEarning ");
		return 34667.678d;
	}
	public static char equipmentGrade(){
		System.out.println("Running Method:equipmentGrade");
		return 'B';
	}
	public static boolean isOpen(){
		System.out.println("Running Method :isOpen");
		return false;
	}

}