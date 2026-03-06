class Transaction {
	 String transactionId;
	 String status;
	 ContentLibrary contentLibrary;

	Transaction ( String transactionId,String status, ContentLibrary contentLibrary){
		if (contentLibrary!=null){
			this.transactionId=transactionId;
			this.status=status;
			this.contentLibrary=contentLibrary;
			}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
		
	}
	void displayTransaction(){
	System.out.println("transactionId : "+transactionId);
	System.out.println(" status : "+status);	
	contentLibrary.displayContentLibrary();
		
	}
}
