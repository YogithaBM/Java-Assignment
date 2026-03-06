class Movie{
	String movieTitle;
	String director;
	String producer;
	int releaseYear;
	String genre;
	float rating;
	double budget;
	boolean isHit;
	int duration;
	String language;
	static int count;
    
 
	Movie(){
        System.out.println("Constructor with 0 parameters executed");
    }

    Movie(String movieTitle,String director){
        this(); 
        this.movieTitle=movieTitle;
        this.director=director;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    Movie(String movieTitle,String director,
	String producer){
        this(movieTitle, director);
        this.producer=producer;
        System.out.println("Constructor with 3 parameters executed");
    }

    Movie(String movieTitle,String director,
	String producer,
	int releaseYear,String genre){
        this(movieTitle, director, producer);
        this.releaseYear=releaseYear;
        this.genre=genre;
        System.out.println("Constructor with 5 parameters executed");
    }

    Movie(String movieTitle,String director,
	String producer,
	int releaseYear,String genre,
	float rating,
	double budget,boolean isHit){

        this(movieTitle, director, producer,
         releaseYear, genre);
        this.rating=rating;
        this.budget=budget;
        this.isHit=isHit;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Movie(String movieTitle,String director,
	String producer,
	int releaseYear,String genre,
	float rating,
	double budget,boolean isHit,
	int duration,String language){

        this(movieTitle, director, producer,
         releaseYear,genre,rating,budget,isHit);
        this.duration=duration;
        this.language=language;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	public void display(){
		System.out.println("MOVIE DETAILS");
		System.out.println(movieTitle);
		System.out.println(director);
		System.out.println(producer);
		System.out.println(releaseYear);
		System.out.println(genre);
		System.out.println(rating);
		System.out.println(budget);
		System.out.println(isHit);
		System.out.println(duration);
		System.out.println(language);
		System.out.println("Burger count: "+count);
	}
    
    
}