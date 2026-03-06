class ContentLibrary {
	
	String libraryName;
	int totalTitles; 
	Movie movie;
	
	ContentLibrary (String libraryName, int totalTitles, Movie movie){
		if (movie!=null){
			this.libraryName=libraryName;
			this.totalTitles=totalTitles;
			this.movie=movie;
			}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
		
	}
	void displayContentLibrary (){
		System.out.println(" libraryName: "+libraryName);
		System.out.println("totalTitles : "+ totalTitles);
		movie.displayMovie();
		
		
	}
}