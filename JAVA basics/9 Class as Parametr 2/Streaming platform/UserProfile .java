class UserProfile {
	 String profileName; 
	 int age;
	 Subscription subscription;
	UserProfile( String profileName, int age, Subscription subscription){
		if (subscription!=null){
			this.profileName=profileName;
			this.age=age;
		this.subscription=subscription;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
	}
	
	void displayUserProfile(){
		System.out.println("profileName  : "+profileName);
		System.out.println(" age : "+age);
		subscription.displaySubscription();
		
	}
}