class VideoPlayer {
	String resolution;
	boolean subtitlesEnabled; 
	StreamingServer streamingServer;
	
	VideoPlayer(String resolution, boolean subtitlesEnabled, StreamingServer streamingServer){
		if (streamingServer!=null){
		this.resolution=resolution;
		this.subtitlesEnabled=subtitlesEnabled;
		this.streamingServer=streamingServer;
		}
		else{
			System.out.println("Null value ,plzz pass a proper value");
		
		}
		
		
	}
	
	void displayVideoPlayer(){
		System.out.println("resolution : "+resolution);
		System.out.println("subtitlesEnabled :"+subtitlesEnabled);
		streamingServer.displayStreamingServer();
		
	}
}