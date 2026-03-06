class Result{
	static String studentName="Max";
	static int total=475;
	static float cgpa= 8.23f;
	static byte totalSub=6;
	static long totalStudends=3506764l;
	
	public static void main(String[] args){
	
	
	long userRegNum = returnRegisterNumber();
	int userSubCode = returnSubCode();
	String userSubject = returnSubject();
	byte userScore = returnScore();
	float userPercent = returnPercent();
	double userAttendence= returnAttendence() ;
	char userGrade = returnGrade();
	boolean userPass = returnPass();
	
		System.out.println(" Reg = "+userRegNum+" ,"+" code =  "+userSubCode+" ,"+" sub = "+userSubject+" ,"+" score = "+userScore+" ,"+" percent = "+userPercent+" ,"+" attend. = "+userAttendence+" ,"+" grade = "+userGrade+","+" pass "+userPass);
		System.out.println( " Name = "+studentName+","+" total= "+total+","+" cgpa= "+cgpa+","+" totalSub "+ totalSub +","+" totalStudents ="+totalStudends);
		
		
	}
	
	public static long returnRegisterNumber(){
		System.out.println(" Running Method:returnRegisterNumber ");
		return 564783224;
		}
		
	public static int returnSubCode(){
		System.out.println(" Running Method:returnSubCode ");
		return 56420;
		}
		
	public static String returnSubject(){
		System.out.println(" Running Method: returnSubject ") ;
		return "Maths";
		}
		
	public static byte returnScore(){
		System.out.println(" Running Method :returnScore ");
		return 45;
		}
		
	public static float returnPercent(){
		System.out.println(" Running Method :returnPercent ");
		return 92.4f ;
		}
		
	public static double returnAttendence() {
		System.out.println(" Running Method : returnAttendence ");
		return 85.795d ;
		}	
	public static char returnGrade(){
		System.out.println("Running Method : returnGrade ");
		return 'A' ;
		}
	public static boolean returnPass(){
			System.out.println("Running Method :returnPass");
			return true ;
	}
		
}