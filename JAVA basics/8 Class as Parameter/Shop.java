class Shop{
	public void ads(Display display){
		if (display!=null){
		display.run();
		}
		else {
			System.out.println("the passes value is null,plzz pass proper value");
		}
	}
}