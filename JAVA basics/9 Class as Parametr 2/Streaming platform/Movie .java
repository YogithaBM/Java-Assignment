class Movie {
	String movieTitle; 
	String genre; 
	Series series;
	Movie (String movieTitle,String genre,Series series){
		if (series!=null){
		this.movieTitle=movieTitle;
		this.genre=genre;
		this.series=series;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
	}
	void displayMovie(){
		System.out.println("movieTitle : "+movieTitle);
		System.out.println("genre :"+genre);
		series.displaySeries();
	}
}