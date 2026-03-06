class Payment {
	 String paymentMethod; 
	 double amount;
	 Transaction transaction;
	 
	 
	Payment ( String paymentMethod,double amount,Transaction transaction){
		if (transaction!=null){
		this.transaction=transaction;
		this.paymentMethod=paymentMethod;
		this.amount=amount;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	void displayPayment (){
		System.out.println(" amount : "+amount);
		System.out.println("paymentMethod : "+paymentMethod);
		transaction.displayTransaction();
		
	}
}