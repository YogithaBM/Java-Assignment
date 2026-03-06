class Railway{
	public static void railwayName(String stationname){
		System.out.println("railwayname"+stationname);
		}
	public static void platform(String platFormName,int floor,String passengerName){
		System.out.println("platFormNumber= "+platFormName+"floor= "+floor+"passengerName= "+passengerName);
	}
	public static void cancelTicket(String passengerName,String destination,String reason){
		System.out.println("passengerName= "+passengerName+"destination= "+destination+"reason= "+reason);
		
	}
	public static void addTrain (int totalPassengers,int totalTrains,String destination ,char trainGrade){
		System.out.println("totalPassengers= "+totalPassengers+"totalTrains= "+totalTrains+"destination= "+destination+
		"trainGrade= "+trainGrade);
	}
	public static void updateSchedule(String time,String date,int totalSeats,int totalcompartments){
		System.out.println("time= "+time+"date = "+date+"totalSeats= "+totalSeats+"totalcompartments= "+totalcompartments);
	}
}