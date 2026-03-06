class MainRunner{
	public static void main (String[] args){
	Shop shop=new Shop();
	Display display=new Display();
	shop.ads(display);
	System.out.println("  ");
	shop.ads(null);
	System.out.println("  ");
	
	
	Theater theater=new Theater();
	Poster poster=new Poster();
	theater.show(poster);
	System.out.println("  ");
	theater.show(null);
	System.out.println("  ");
	
	Rocket rocket=new Rocket();
	Fuel fuel=new Fuel();
	rocket.launch(fuel);
	System.out.println("  ");
	rocket.launch(null);
	System.out.println("  ");
	
	Camera camera=new Camera();
	Lens lens=new Lens();
	camera.capture(lens);
	System.out.println("  ");
	camera.capture(null);
	System.out.println("  ");
	
	Barber barber =new Barber();
	Customer customer =new Customer();
	barber.cut(customer);
	System.out.println("  ");
	barber.cut(null);
	System.out.println("  ");
	
	
	}
	
	
}