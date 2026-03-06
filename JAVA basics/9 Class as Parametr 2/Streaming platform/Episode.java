class Episode {
	String episodeTitle; 
	int duration; 
	VideoPlayer videoPlayer;
	Episode(String episodeTitle, int duration,VideoPlayer videoPlayer){
		if (videoPlayer!=null){
		this.episodeTitle=episodeTitle;
		this.duration=duration;
		this.videoPlayer=videoPlayer;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		}
		
		
	}
	
	void displayEpisode(){
		System.out.println("episodeTitle : "+episodeTitle);
		System.out.println("duration : "+duration);
		videoPlayer.displayVideoPlayer();
		
		
		
	}
}