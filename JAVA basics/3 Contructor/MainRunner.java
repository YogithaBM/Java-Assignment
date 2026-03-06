class MainRunner{
	public static void main(String[] args){
		Market market1= new Market();
		Market market2=new Market();
		Market market3=new Market();
		market1.fruitCount();
		market3.vegeCount();
		System.out.println("  ");
		
		Stationary stationary1=new Stationary();
		Stationary stationary2= new Stationary();
		Stationary stationary3= new Stationary();
		System.out.println("penCount "+stationary1.penCount());
		System.out.println(" cost= "+stationary3.cost());
		System.out.println("  ");
		
		Animal animal1 = new Animal();
		Animal animal2= new Animal();
		Animal animal3 = new Animal();
		System.out.println("animalCount= "+animal1.animalCount());
		animal2.displayWelcome();
		System.out.println("  ");
		
		Novel novel1= new Novel();
		Novel novel2=new Novel();
		Novel novel3=new Novel();
		System.out.println(" bookCount= "+novel2.bookCount());
		System.out.println(" authorName= "+novel3.authorName());
		System.out.println("  ");
		
		Student student1= new Student();
		Student student2= new Student();
		Student student3=new Student();
		System.out.println(" studentName= "+student1.studentName());
		System.out.println(" registerNum= "+student3.registerNum());
		System.out.println("  ");
		
		Car car1 =new Car();
		Car car2=new Car();
		Car car3 =new Car();
		System.out.println("wowFunction= "+car1.wowFunction());
		System.out.println("wheelCount= "+car3.wheelCount());
		System.out.println("  ");
		
		Library library1 =new Library();
		Library library2=new Library();
		Library library3=new Library();
		System.out.println("bookCount= "+library1.bookCount());
		library2.dispayWelcome();
		System.out.println("  ");
		
		Employee employee1=new Employee();
		Employee employee2=new Employee();
		Employee employee3=new Employee();
		System.out.println("employeeName= "+employee3.employeeName());
		System.out.println("role= "+employee2.role());
		System.out.println("  ");
		
		Movie movie1= new Movie();
		Movie movie2= new Movie();
		Movie movie3= new Movie();
		System.out.println("movieName= "+movie1.movieName());
		System.out.println("minCount= "+movie2.minCount());
		System.out.println("  ");
		
		Gym gym1=new Gym();
		Gym gym2=new Gym();
		Gym gym3=new Gym();
		gym1.displayWelcome();
		System.out.println("gymName= "+gym3.gymName());
		System.out.println("  ");
		
		Flight flight1=new Flight();
		Flight flight2=new Flight();
		Flight flight3=new Flight();
		System.out.println("passengersCount= "+flight1.passengersCount());
		System.out.println("takeOffTime= "+flight3.takeOffTime());
		System.out.println("  ");
		
		School school1=new School();
		School school2=new School();
		School school3=new School();
		System.out.println("schoolName= "+school2.schoolName());
		System.out.println("studentCount= "+school3.studentCount());
		System.out.println("  ");
		
		ATM aTM1=new ATM();
		ATM aTM2=new ATM();
		ATM aTM3=new ATM();
		System.out.println("credit= "+aTM1.credit());
		System.out.println("debit= "+aTM3.debit());
		System.out.println("  ");
		
		MusicPlayer musicPlayer1=new MusicPlayer();
		MusicPlayer musicPlayer2=new MusicPlayer();
		MusicPlayer musicPlayer3=new MusicPlayer();
		System.out.println("playerName= "+musicPlayer2.playerName());
		System.out.println("songsCount= "+musicPlayer3.songsCount());
		System.out.println("  ");
		
		Hostel hostel1=new Hostel();
		Hostel hostel2=new Hostel();
		Hostel hostel3=new Hostel();
		hostel1.displayWelcome();
		System.out.println("roomCount= "+hostel3.roomCount());
		System.out.println("  ");
		
		WeatherApp weatherApp1=new WeatherApp();
		WeatherApp weatherApp2=new WeatherApp();
		WeatherApp weatherApp3=new WeatherApp();
		System.out.println("weatherAppName= "+weatherApp2.weatherAppName());
		System.out.println("showTemperature= "+weatherApp3.showTemperature());
		System.out.println("  ");
		
		
		
		
	
	}
}