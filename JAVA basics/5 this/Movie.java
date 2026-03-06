class Movie{
	String title ;
	String hero;
	String genre;
	double rating ;
	
	Movie(String title,String hero,String genre,double rating){
	
		this.title=title;
		this.hero=hero;
		this.genre=genre;
		this.rating=rating;
		System.out.println("Title: "+this.title);
		System.out.println("Hero: "+this.hero);
		System.out.println("Genre: "+this.genre);
		System.out.println("Rating: "+this.rating);
		

		
	}
}