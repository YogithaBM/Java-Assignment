class District{
	Taluk taluk;
	DistrictChef districtChef;
	District (Taluk taluk,DistrictChef districtChef){
		this.taluk=taluk;
		this.districtChef=districtChef;
		
	}
	void displayDistrict(){
		if (taluk!=null&&districtChef!=null){
		taluk.displayTaluk();
		districtChef.displayDChef();
		}
		else{
			System.out.println("the passed value is null,pass a proper value");
			
		}
		
	}
	
}