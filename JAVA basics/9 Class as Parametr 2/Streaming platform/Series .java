class Series {
	 String seriesTitle;
	 int seasons;
	 Episode episode;
	Series( String seriesTitle, int seasons,Episode episode){
		if (episode!=null){
		this.seriesTitle=seriesTitle;
		this.seasons=seasons;
		this.episode=episode;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
	}
	
	void displaySeries(){
		System.out.println("seriesTitle : "+seriesTitle);
		System.out.println("seasons : "+seasons);
		episode.displayEpisode();
	}
}