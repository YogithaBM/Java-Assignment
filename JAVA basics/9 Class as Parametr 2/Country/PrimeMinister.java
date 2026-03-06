class PrimeMinister{
	
	String PMName;
	int PMAge;
	ChefMinister chefMinister;
	PrimeMinister(String PMName,int PMAge,ChefMinister chefMinister){
		this.PMName=PMName;
		this.PMAge=PMAge;
		this.chefMinister=chefMinister;
		System.out.println("Running Constructor:PrimeMinister");
	}
	void displayPrimeMinister(){
		chefMinister.displayChefMinister();
		System.out.println("PrimeMinister Name : "+PMName);
		System.out.println("PrimeMinister age : "+PMAge);
		
		
	}
	


	
	
	
}