class Rocket{
	void launch(Fuel fuel){
		if (fuel!=null){
			fuel.ignite();
		}
		else{
			System.out.println("the passes value is null,plzz pass proper value");
		}
		
	}

}