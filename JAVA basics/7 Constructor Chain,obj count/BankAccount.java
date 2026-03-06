class BankAccount{

    String accountHolderName;
	long accountNumber;
	String bankName;
	String branchName;
	double balance;
	String accountType;
	boolean isActive;
	String ifscCode;
	String nomineeName;
	String mobileNumber;
	static int count=0;
 
	BankAccount(){
        System.out.println("Constructor with 0 parameters executed");
    }


    
    BankAccount(String accountHolderName,
	long accountNumber){
        this(); 
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        System.out.println("Constructor with 2 parameters executed");
    }


   
    BankAccount(String accountHolderName,
	long accountNumber,String bankName){
         this(accountHolderName, accountNumber);
        this.bankName=bankName;
        System.out.println("Constructor with 3 parameters executed");
    }


    
    BankAccount(String accountHolderName,
	long accountNumber,String bankName,
	String branchName){
         this(accountHolderName, accountNumber,
         bankName);
        this.bankName=bankName;
        this.branchName=branchName;
        System.out.println("Constructor with 5 parameters executed");
    }

    BankAccount(String accountHolderName,
	long accountNumber,String bankName,
	String branchName,double balance,
	String accountType,boolean isActive,String ifscCode){

         this(accountHolderName, accountNumber,
         bankName, branchName);
        this.accountType=accountType;
        this.isActive=isActive;
        this.ifscCode=ifscCode;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    BankAccount(String accountHolderName,
	long accountNumber,String bankName,
	String branchName,double balance,
	String accountType,boolean isActive,String ifscCode,
	String nomineeName,String mobileNumber){

         this(accountHolderName, accountNumber,
         bankName, branchName, balance,accountType,isActive,ifscCode);
        this.nomineeName=nomineeName;
        this.mobileNumber=mobileNumber;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	public void display(){
		System.out.println("Bank Account Details");
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
		System.out.println(bankName);
		System.out.println(branchName);
		System.out.println(balance);
		System.out.println(accountType);
		System.out.println(isActive);
		System.out.println(ifscCode);
		System.out.println(nomineeName);
		System.out.println(mobileNumber);
		System.out.println("Burger count: "+count);
}
       
}