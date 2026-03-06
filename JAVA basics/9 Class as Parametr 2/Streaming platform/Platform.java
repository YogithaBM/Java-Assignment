class Platform{
	 String platformName; 
	 double rating;
	 Account account;
	 
	Platform( String platformName,double rating,Account account){
		if (account!=null){
			this.platformName=platformName;
			this.rating=rating;
			this.account=account;
			}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	}
	void displayPlatform(){
		System.out.println("platformName : "+platformName);
		System.out.println("rating : "+rating);
		account.displayAccount();
		
	}
}