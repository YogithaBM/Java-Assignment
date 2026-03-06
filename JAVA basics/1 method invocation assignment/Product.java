class Product{
	static byte orderNumber=54;
	static String paymentMethod= "cash";
	static double rating=3.045d;
	static boolean orderingCompleted=true;
	static int appSize= 34526;
	public static void main(String[] args){
		String appName=returnAppName();
		byte reviewCount= returnReviewCount();
		float discount=returnDiscount();
		short code=productCode();
		int count=orderCount();
		long contact=contactNumb();
		char grade=memShipGrade();
		boolean policy=returnPolicyStatus();
		displayPayment();
		
		
	System.out.println(" appName= "+appName+"  reviewCount= "+reviewCount+" discount= "+discount+ ","+" code= "+code+","+"  count= "+ count+","+" contact= "+contact+","+" grade= "+grade+","+"  policy= "+ policy);
	System.out.println(" orderNumber ="+ orderNumber+","+" paymentMethod "+paymentMethod+","+"rating "+rating+","+" orderingCompleted= "+orderingCompleted+","+" appSize= "+appSize);
		
	
	}
	
	public static String returnAppName(){
		System.out.println("Running Method:returnAppName");
		return "Nykaa";
	}
	
	public static byte returnReviewCount(){
		System.out.println("Running Method:returnReviewCount");
		return 60;
		
	}
	
	public static float returnDiscount(){
		System.out.println("Running Method:returnDiscount");
		return 35.45f;
		
	}
	
	public static short productCode(){
		System.out.println("Running Method:productcode");
		return 254;
		
	
	}
	
	public static int orderCount(){
		System.out.println("Running Method:orderCount");
		return 43632;
		
	}
	
	public static long contactNumb(){
		System.out.println("Running Method:contactNumb");
		return 3654729484l;
		
		
	}
	
	public static char memShipGrade(){
		System.out.println("Running Method:meShipGrade");
		return 'S';
		
	}
	
	public static boolean returnPolicyStatus(){
		System.out.println("Running Method:returnPolicyStatus");
		return false ;
		
	}
	
	public static void displayPayment(){
	System.out.println("Running Method:displayPayment");
	}
	
	
}
	