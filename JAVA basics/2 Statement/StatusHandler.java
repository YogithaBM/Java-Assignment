class StatusHandler{
	public static void main(String [] args){
		paymentstatus("FAILED");
	}
	public static void paymentstatus(String status){
		if (status=="SUCCESS"){
			System.out.println("SUCCESS");
		}
		else if(status == "FAILED"){
			System.out.println("Transaction Failed");
		}
		else if (status =="PENDING" ){
			System.out.println("Awaiting Payment Confirmation");
		}
	}
}