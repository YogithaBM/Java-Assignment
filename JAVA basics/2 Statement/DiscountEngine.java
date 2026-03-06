class DiscountEngine{
	static double payable;
	public static void main(String[] args){
		amount(545);
		
	}
	public static void amount(double cAmt){
		if (cAmt>=5000){
			payable=cAmt-(cAmt*0.20);
			System.out.println("Final Amount= "+payable);
		}
		else if (cAmt>=2000){
			payable=cAmt-(cAmt*0.10);
			System.out.println("Final Amount= "+payable);
		}
		else {
			payable=cAmt;
			System.out.println("No discount, ZORRY")
			System.out.println("Final Amount= "+payable);
		}
		
		
	}
}