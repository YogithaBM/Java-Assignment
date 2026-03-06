class Subscription {
	String planName; 
	double monthlyPrice;
	Payment payment;
	
	
	Subscription (String planName,double monthlyPrice, Payment payment){
		if (payment!=null){
			this.planName=planName;
			this.monthlyPrice=monthlyPrice;
			this.payment=payment;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
	}
	void displaySubscription(){
		System.out.println(" planName : "+planName);
		System.out.println("monthlyPrice : "+monthlyPrice);
		payment.displayPayment();
		
		
	} 
}