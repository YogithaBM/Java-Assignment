class Customer{
	String customerName;
	String phone;
	Address address;
      
	  Customer(String customerName,String phone,Address address){
		  this.customerName=customerName;
		  this.phone=phone;
		  this.address=address;
		  System.out.println("Inside constructor Customer");
		  
	  }
	  void displayCustomer(){
		  System.out.println("Customer Name : "+customerName);
		  System.out.println("Phone : "+phone);
		  address.displayAddress();
	  }

}