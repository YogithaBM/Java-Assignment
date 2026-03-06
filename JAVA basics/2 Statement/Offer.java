class Offer{
	public static void main(String [] args){
		discount(3);
	}
	public static void discount(int num){
	switch (num){
			case 1:{
				System.out.println("Monday:10% Discount");
				break;
			}
			case 2:{
				System.out.println("Tuesday Offer: Free Delivery");
				break;
			}
			case 3:{
				System.out.println("Wednesday Offer: Buy 1 Get 1");
				break;
			}
			case 4:{
				System.out.println("Thursday Offer: Cashback 5%");
				break;
			}
			case 5:{
				System.out.println("Friday Offer: 15% Discount");
				break;
			}
			case 6:{
				System.out.println("Weekend Mega Sale,JACKPOT HURRAY");
				break;
			}
			case 7:{
				System.out.println("Weekend Mega Sale,JACKPOT HURRAY");
				break;
			}
			default :{
			System.out.println("Invalid Day,Don't know weekname!!,UNPAD");
			}
				
		}
	
	}
}