class Cafe{
	static int todaySales=43533;
	static double bill=322.453d;
	static char serviceGrade='A';
	static String topItem="idle";
	static float discount=35.76f;


	public static void main(String[]  args){
		String cafeName=returnCafeName();
		short staffCount=returnstaffCount();
		byte tableCount=returntableCount();
		int orderCount=returnorderCount();
		long contactNumber=returnContactNumber();
		boolean isOpenStatus=returnisOpenStatus();
		char rating=returnRating();
		
		System.out.println("cafeName= "+cafeName+","+"staffCount= "+staffCount+","+"tableCount= "+tableCount+","+"orderCount= "+orderCount+","+"contactNumber= "+contactNumber+","+"isOpenStatus= "+isOpenStatus+","+"returnRating= "+rating);
		
		System.out.println("todaySales= "+todaySales+","+"bill= "+bill+","+"serviceGrade= "
		+serviceGrade+","+"topItem= "+topItem+","+"discount= "+discount);
		
	}
	
	public static String returnCafeName(){
		System.out.println("running Method :returnCfeName");
		return "Momo";
	}
	
	public static short returnstaffCount(){
		System.out.println("Running Method: stffCount");
		return 15;
		
	}
	
	public static byte returntableCount(){
		System.out.println("Running Method:tableCount");
		return 10;
	}
	
	public static int returnorderCount(){
		System.out.println("Running Method :orderCount");
		return 23455;
		
	}
	
	public static long returnContactNumber(){
		System.out.println("Running Method:contactNumber");
		return 486639246l;
	}
	
	public static boolean returnisOpenStatus(){
		System.out.println("Running Method:isOpenStatus");
		return true;
		
	}
	public static char returnRating(){
		
		System.out.println("Running Method:returnRating");
		return 'A';
	}
	
}