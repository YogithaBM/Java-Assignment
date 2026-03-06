class Camera{
	void capture(Lens lens){
		if (lens!=null){
			lens.focus();
		}
		else{
			System.out.println("the passes value is null,plzz pass proper value");
		}
		
	}
}