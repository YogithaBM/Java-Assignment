class Flight{
	String flightNumber;
	String airline;
	String source;
	String destination;
	double ticketPrice;
	int duration;
	boolean isInternational;
	int totalSeats;
	int availableSeats;
	String departureTime;
	static int count=0;

 
	Flight(){
        System.out.println("Constructor with 0 parameters executed");
    }
    
    Flight(String flightNumber,String airline){
        this(); 
        this.flightNumber=flightNumber;
        this.airline=airline;
        System.out.println("Constructor with 2 parameters executed");
    }

    Flight(String flightNumber,String airline,
	String source){
        this(flightNumber, airline);
        this.source=source;
        System.out.println("Constructor with 3 parameters executed");
    }
    
    Flight(String flightNumber,String airline,
	String source,String destination,
	double ticketPrice){
        this(flightNumber, airline, source);
        this.destination=destination;
        this.ticketPrice=ticketPrice;
        System.out.println("Constructor with 5 parameters executed");
    }

    Flight(String flightNumber,String airline,
	String source,String destination,
	double ticketPrice,
	int duration,boolean isInternational,
	int totalSeats){

        this(flightNumber, airline, source,
         destination, ticketPrice);
        this.duration=duration;
        this.isInternational=isInternational;
        this.totalSeats=totalSeats;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Flight(String flightNumber,String airline,
	String source,String destination,
	double ticketPrice,
	int duration,boolean isInternational,
	int totalSeats,
	int availableSeats,String departureTime){

        this(flightNumber, airline, source,
         destination, ticketPrice,duration,isInternational,totalSeats);
        this.availableSeats=availableSeats;
        this.departureTime=departureTime;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	
    public void display() {
	System.out.println("FLIGHT DETAILS");
	System.out.println(flightNumber);
    System.out.println(airline);
    System.out.println(source);
    System.out.println(destination);
    System.out.println(ticketPrice);
    System.out.println(duration);
    System.out.println(isInternational);
    System.out.println(totalSeats);
    System.out.println(availableSeats);
    System.out.println(departureTime);
	System.out.println("Burger count: "+count);

    }
}