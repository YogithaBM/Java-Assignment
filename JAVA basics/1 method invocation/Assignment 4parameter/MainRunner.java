class MainRunner{
	public static void main(String[] args){
		System.out.println("Running Class:CultGym");
		CultGym.printMember("SHAMU");
		CultGym.addMember("YAMI",453,45.435d);
		CultGym.assigntrainer("SWAMI",35435,"NAMI");
		CultGym.equipment("DUMBLES","ARMSTRENGTH",2,454.565D);
		CultGym.updatePlan("ASHOK","12-02-26",4,7555.86D);
		System.out.println("           ");
		
		
		System.out.println("Running Class: Restaurunt");
		Restaurunt.printname("ENNE");
		Restaurunt.takeOver("YOGI","BIRYANI",4);
		Restaurunt.cancelOrder("HITA","NOODLE",7);
		Restaurunt.addItem("KABAB",34.56D,"MAIN COURSE",56);
		Restaurunt.updateItem("GEERICE",64.876D,"SIDE DISD",86);
		System.out.println("           ");
		
		
		System.out.println("Running Method :Railway");
		Railway.railwayName("CHENAI EXPRESS");
		Railway.platform("FOURTH",43,"KAIRA");
		Railway.cancelTicket("KAIRA","CHENAI","MOOD OFF");
		Railway.addTrain(454,34546,"CHENAI",'C');
		Railway.updateSchedule("10.30pm","16-03-26",3243,5345);
		System.out.println("              ");
		
		
		System.out.println("Running class :Chair ");
		Chair.chairType("Shinyo Chairs");
		Chair.chairCost(566,45,46.354d);
		Chair.chairGrade('A',true ,true);
		Chair.buyChairs((byte)5,(short)45,435.4534d,true);
		Chair.returnChair((byte)4,454.343d,"DAMGED PEICE",true);
		System.out.println("              ");
		
		
		System.out.println("Running class :Shop");
		Shop.item("CHOKI CHOKI");
		Shop.sale(453,53.65D,"RETAIL");
		Shop.bill("ICE CREAMN",4,56.75D);
		Shop.stock("LOLLI",756,75.97D,false);
		Shop.ship("BULB",34,4534.65d,"BANGALORE");
		
		
		
		
		
	}
}