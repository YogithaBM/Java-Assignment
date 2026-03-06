class Theater{
	void show(Poster poster){
		if (poster!=null){
			poster.showInfo();
		}
		else {
			System.out.println("the passes value is null,plzz pass proper value");
		}
		
		
	}
}