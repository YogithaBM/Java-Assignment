class MainRunner{
	public static void main(String[] args){
		System.out.println("Running Class in Artist");
		String singer=Artist.favSinger();
		short song=Artist.favSongCount();
		int album=Artist.albumCount();
		
		System.out.println("singer= "+singer);
		System.out.println("song= "+song);
		System.out.println("album= "+album);
		System.out.println("             ");
		
		
		
		System.out.println("Running Class is BankOfBaroda");
		long accountNumber=BankOfBaroda.accNumber();
		double balance=BankOfBaroda.getBlance();
		boolean accountActive=BankOfBaroda.isAccActive();
		
		System.out.println("accountNumber= "+accountNumber);
		System.out.println("accountActive= "+accountActive);
		System.out.println("balance= "+balance);
		System.out.println("             ");

		
		
		
		System.out.println("Running Class is BookStore");
		int books=BookStore.bookCount();
		double bookSalse=BookStore.salesCount();
		boolean open=BookStore.isOpen();
		
		System.out.println("books= "+books);
		System.out.println("open="+open);
		System.out.println("bookSalse= "+bookSalse);
		System.out.println("             ");
		
		
		
		System.out.println("Running Class is Cinema ");
		byte totalScreen=Cinema.screenCount();
		double ticket=Cinema.ticketPrice();
		boolean threeD=Cinema.is3DAvailable();
		
		System.out.println("totalScreen= "+totalScreen);
		System.out.println("ticket= "+ticket);
		System.out.println("threeD= "+threeD);
		System.out.println("             ");
		
		
		System.out.println("Running CLass is Libraray");
		String libName=Library.libraryName();
		int numberOfAuthor=Library.authorcount();
		long libCount=Library.libraryContact();
		
		System.out.println("libraryContact= "+libCount);
		System.out.println("libraryName= "+libName);
		System.out.println("numberOfAuthor="+numberOfAuthor);
		System.out.println("             ");
		
		
		
		System.out.println("Running Class is Pyschiatrist");
		short patientNumbers=Pyschiatrist.patientCount();
		double fee=Pyschiatrist.returnFee();
		boolean available=Pyschiatrist.isAvailable();

		System.out.println("patientNumbers= "+patientNumbers);
		System.out.println("fee= "+fee);
		System.out.println("available= "+available);
		System.out.println("             ");
		
		
		
		
		System.out.println("Running Class is Airport ");
		short flight=Airport.flightCount();
		int attendees=Airport.attendeesCount();
		boolean international=Airport.isInternational();
		
		System.out.println("flight= "+flight);
		System.out.println("attendees= "+attendees);
		System.out.println("international= "+international);
		System.out.println("             ");
		
		
		
		System.out.println("Running Class is School ");
		int students=School.studentCount();
		String schlName=School.schoolName();
		char grade=School.returnGrade();
		
		System.out.println("students= "+students);
		System.out.println("SchoolName= "+schlName);
		System.out.println("grade= "+grade);
		System.out.println("             ");
		
		
		
		System.out.println("Running class is Scientist ");
		String scientist=Scientist.scientistName();
		byte numberOfDiscover=Scientist.discoverCount();
		String mostKnownDiscovery=Scientist.topDiscover();

		System.out.println("scientistName= "+scientist);
		System.out.println("discoverCount= "+numberOfDiscover);
		System.out.println("mostKnownDiscovery= "+mostKnownDiscovery);
		
		
		}

}