class RoleBased{
	public static void main(String [] args){
		
		accessSystem("udcs");
		
	}
	public static void accessSystem(String role){
		switch (role){
			case "ADMIN":{
				System.out.println("Full system access");
				break;
			}
			case "USER":{
				System.out.println("Limited access");
				break;
			}
			case "MANAGER":{
				System.out.println("Manage team access");
				break;
			}
			case "GUEST":{
				System.out.println("View only access");
				break;
			}
			default:{
				System.out.println("Invalid role");
			}
			
			
		}
	}
}