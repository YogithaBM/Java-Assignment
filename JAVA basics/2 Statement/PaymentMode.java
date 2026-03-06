class PaymentMode{
	public static void main(String [] args){
		
		accessSystem("COD");
		
	}
	public static void accessSystem(String mode){
		switch (mode){
			case "UPI":{
				System.out.println("Redirecting to UPI Gateway");
				break;
			}
			case "CARD":{
				System.out.println("Processing Card Paymen");
				break;
			}
			case "NETBANKING":{
				System.out.println("Redirecting to Bank");
				break;
			}
			case "COD":{
				System.out.println("Cash on Delivery Selected");
				break;
			}
			default:{
				System.out.println("Don't u want to pay ,Invalid Payment Mode");
			}
			
		}
	}
}