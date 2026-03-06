class MainRunner {
    public static void main(String[] args) {
	
    Company company =new Company("Akamai", "USA", 3432);

    InternetProvider internetProvider =new InternetProvider("JioFiber", 324, company);

    Device device =new Device("Laptop", "Windows", internetProvider);

    Region region =new Region("AsiaPacific", "India", device);

    DataCenter dataCenter =new DataCenter("Mumbai", 6443, region);

    CDN cdn =new CDN("Cloudflare", 6544, dataCenter);

    StreamingServer streamingServer =new StreamingServer("SDRG324", "Mumbai", cdn);

    VideoPlayer videoPlayer =new VideoPlayer("1080p", true, streamingServer);

    Episode episode =new Episode("Episode 1",534, videoPlayer);

    Series series =new Series("Stranger Things", 45, episode);

    Movie movie=new Movie("Avengers", "Action", series);

    ContentLibrary contentLibrary =new ContentLibrary("Netflix Library",4355634, movie);

    Transaction transaction =new Transaction("fsd452DF", "Success", contentLibrary);

    Payment payment=new Payment("Credit Card", 56.546d, transaction);

    Subscription subscription =new Subscription("Premium", 496.453d, payment);

    UserProfile userProfile =new UserProfile("Seventeen", 453, subscription);

    Account account =new Account("jennie@gmail.com", "pass123", userProfile);

    Platform platform =new Platform("Netflix", 5453.345d, account);
	
	platform.displayPlatform();
	
	
    }
}



	
