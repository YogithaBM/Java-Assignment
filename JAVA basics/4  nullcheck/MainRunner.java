class MainRunner{
	public static void main(String [] args){
	BigBasket bigBasket=new BigBasket();
	if (bigBasket!=null){
	System.out.println("newOffers= "+bigBasket.newOffers());
	System.out.println("    ");
	}
	else System.out.println("Object bigbasket is not there ,it is null");
	
	
	BookType bookType=new BookType();
	if (bookType!=null){
	System.out.println("unruled= "+bookType.unruled());
	System.out.println("    ");
	}
	else System.out.println("Object bookType is not there ,it is null");

	
	ArtType artType=new ArtType();
	if (artType!=null){
	System.out.println("coloursCount= "+artType.coloursCount());
	System.out.println("    ");
	}
	else System.out.println("Object artType is not there ,it is null");

	
	Marker marker=new Marker();
	if (marker!=null){
	System.out.println(""+marker.markerCount());
	System.out.println("   ");
	}
	else System.out.println("Object marker is not there ,it is null");

	
	FaceWash faceWash=new FaceWash();
	if (faceWash!= null){
	System.out.println("mainIngredient= "+faceWash.mainIngredient());
	System.out.println("   ");
	}
	else System.out.println("Object faceWash is not there ,it is null");


	Bottle bottle=new Bottle();
	if (bottle!=null){
	System.out.println("bottleType= "+bottle.bottleType());
	System.out.println("  ");
	}
	else System.out.println("Object bottle is not there ,it is null");

	
	Fruits fruits=new Fruits();
	if (fruits!=null){
	System.out.println("orangeCount= "+fruits.orangeCount());
	System.out.println("  ");
	}
	else System.out.println("Object fruits is not there ,it is null");

	
	Apple apple=new Apple();
	if (apple!= null){
	System.out.println("seedCount= "+apple.seedCount());
	System.out.println("  ");
	}
	else System.out.println("Object apple is not there ,it is null");

	
	ShoeRack shoeRack=new ShoeRack();
	if (shoeRack!=null){
	System.out.println("rackCount= "+shoeRack.rackCount());
	System.out.println("  ");
	}
	else System.out.println("Object shoeRack is not there ,it is null");

	
	HandBags handBags=new HandBags();
	if (handBags!=null){
	System.out.println("isWaterProof= "+handBags.isWaterProof());
	System.out.println("  ");
	}
	else System.out.println("Object handBags is not there ,it is null");

	
	Battery battery=new Battery();
	if (battery!=null){
	System.out.println(""+battery.batteryType());
	System.out.println("  ");
	}
	else System.out.println("Object battery is not there ,it is null");

	
	Money money =new Money();
	if (money!=null){
	money.status();
	System.out.println("  ");
	}
	else System.out.println("Object money is not there ,it is null");

	
	Water water=new Water();
	if (money!=null){
	System.out.println("isDrinkable"+water.isDrinkable());
	System.out.println("  ");
	}
	else System.out.println("Object money is not there ,it is null");

	
	WiFi wiFi=new WiFi();
	if (wiFi!=null){
	System.out.println("isActive= "+wiFi.isActive());
	System.out.println("   ");
	}
	else System.out.println("Object wiFi is not there ,it is null");

	
	
	}

}