class Account  {
	String email;
	String password;
	UserProfile userProfile;

	
	Account(String email, String password ,UserProfile userProfile){
	if (userProfile!=null){
		this.email=email;
		this.password=password;
		this.userProfile=userProfile;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
	
	}
	
	void displayAccount(){
		System.out.println(" password : "+password);
		System.out.println(" email : "+email);
		userProfile.displayUserProfile();
		
	}
}