class Barber{
	public void cut(Customer customer){
		if (customer!=null){
		customer.getHaircut();
		}
		else {
			System.out.println("the passes value is null,plzz pass proper value");
		}
	}
}