class CultGym{
	public static void printMember(String name){
		System.out.println("Member: "+name);

	}
	public static void addMember (String name ,int age ,double fee){
		System.out.println("Name: "+name+"Age:"+age+"Fee: "+fee);

	}
	public static void assigntrainer(String member,int hours,String trainer ){
	System.out.println("member: "+member+"hours: "+hours+"trainer: "+trainer);
	}
	public static void equipment(String name,String type,int quantity,double price ){
		System.out.println("name: "+name+"type: "+type+"quantity: "+quantity+"price: "+price);

	}
	public static void updatePlan(String name,String plan,int duration,double fee){
		System.out.println("name: "+ name +",plan: "+ plan+",duration: "+ duration +",fee: " + fee);

	}

}