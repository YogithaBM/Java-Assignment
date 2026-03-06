class ServerRetry{
	public static void main(String[] args ){
		
	int attempt=1;
	while (attempt<=3){
		System.out.println("Attempt= "+attempt);
		attempt++;
	}
	
		System.out.println("Connection Failed");
	
	}
}