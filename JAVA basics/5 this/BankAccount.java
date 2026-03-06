class BankAccount{
	String accountHolder;
	long accountNumber;
	double balance;
	String branchName;
	
	BankAccount(String accountHolder,long accountNumber,double balance,String branchName){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.branchName=branchName;
		this.balance=balance;
		System.out.println("Account holder: "+this.accountHolder);
		System.out.println("Account Number: "+this.accountNumber);
		System.out.println("Branch Name: "+this.branchName);
		System.out.println("Balance: "+this.balance);
		

		
	}



}