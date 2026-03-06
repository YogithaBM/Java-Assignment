class Chair{
	public static void chairType(String name){
		System.out.println("company:"+name);
	
	}
	public static void chairCost(int cost,int chairCount,double price){
		System.out.println("Cost: "+cost+"Chaircount: "+chairCount+"price of each: "+price);
	}
	public static void chairGrade(char grade,boolean isWaterproof,boolean isFoldable){
		System.out.println("Chair Grade: "+grade+", is water proof: "+isWaterproof+"is it foldable: "+isFoldable);
	}
	public static void buyChairs(byte chairCount ,short chairClothCount,double price,boolean isReturnAvailable){
		System.out.println("Total Chairs: "+chairCount+"Chair cloths count: "+chairClothCount+"total bill: "+price+"Is return available: "+isReturnAvailable);
	}
	public static void returnChair(byte chairCount,double price,String reason,boolean isPossible){
		System.out.println("number of chair to return: "+chairCount+"cost of return: "+price+"reason: "+reason+"isPossible: "+isPossible);
	}
}