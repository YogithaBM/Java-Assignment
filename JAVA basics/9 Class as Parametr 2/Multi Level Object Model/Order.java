class Order{
	int orderId;
	double totalAmount;
	Customer customer;
	
	Order(int orderId,double totalAmount,Customer customer){
		this.orderId=orderId;
		this.totalAmount=totalAmount;
		this.customer=customer;
		
		System.out.println("Inside constructor Order");
	}
	void displayOrder(){
		System.out.println("Order Id : "+orderId);
		System.out.println("Total Amount : "+totalAmount);
		customer.displayCustomer();
		
	}

}