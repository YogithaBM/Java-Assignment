class Hospital{
static long totslPatients= 34758362;
static int staffCount = 3645;
static char clinicGrade = 'A';
static boolean available=false;
static byte works = 46;
	public static void main(String[] args){
		String name = patientName();
		byte num= patientNum();
		int count = patientcount();
		short userWardNum = wardNum();
		long contact = contactNum();
		char grade = patientGrade();
		boolean status = tretmentStatus();
		
		System.out.println("patientName  = "+name+" ,"+" patientcount =  "+num+" ,"+" wardNum =  userWardNum"+" ,"+" contactNum = "+contact +" ,"+" patientGrade = "+grade+","+" tretmentStatus = "+status );
		System.out.println("static variable values are  "+","+totslPatients +","+  staffCount+","+ clinicGrade+","+available+","+works);
		}
	
	public static String patientName() {
		System.out.println(" : patientName");
		return "Henry"; 
				}
				
	public static byte patientNum(){
		System.out.println("Running Method:patientNum");
		return 13 ;
				}
				
	public static int patientcount(){
		System.out.println("Running Method:patientcount");
		return 468723 ;
				}
				
	public static short wardNum(){
		System.out.println("Running Method:wardNum");
		return 578 ;
				}

	public static long contactNum(){
		System.out.println("Running Method:contactNum");
		return 8163547823l ;
				}
	
	public static char patientGrade(){
		System.out.println("Running Method:patientGrade");
		return 'B' ;
				}
 
	public static boolean tretmentStatus(){
		System.out.println("Running Method:tretmentStatus");
		return true ;
		
				}

}