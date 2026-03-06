class Country{
	public static void main(String [] args){
	ChefMinister chefMinister=new ChefMinister(34,"Theo");
	PrimeMinister primeMinister=new PrimeMinister("Neharika",43,chefMinister);
	primeMinister.displayPrimeMinister();

	
	Taluk taluk=new Taluk("Ron");
	DistrictChef districtChef=new DistrictChef("Asmitha",34);
	District district =new District(taluk,districtChef);
	State state=new State(district);
	state.displayState();
	
	}
}