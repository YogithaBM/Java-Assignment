class State{
	District district;
	State(District district){
		this.district=district;
		
	}
	void displayState(){
		district.displayDistrict();
	}

}