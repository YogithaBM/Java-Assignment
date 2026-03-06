class LoginSystem{
	public static void main(String[]  args){
		 login("Yogitha",3456882);
		
	}
	public static void login(String name,int passCode ){
		
		String userName="Yogitha";
		int password=34562;
		if ((userName.equals(name))&&(password==passCode)){
			System.out.println("Login Successful");
			
		}
		else if(!userName.equals(name)){
			System.out.println("Invalid Username");
			
		}
		else {
			System.out.println("Invalid Password");
		}
	}
	
}