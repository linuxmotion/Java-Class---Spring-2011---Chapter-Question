package csis.weyrauch.org;

public class Interest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double amount;
		double principal = 1000.0;
		double rate = 0.05;
		

		
		for (int pnum = 1; pnum <= 6; pnum++){
			
			System.out.printf("%s%20s%15s\n", "Year", "Amount on deposit", "Interest Rate");	
			for( int year = 1; year <= 10; year++){
				
				
				amount = principal * Math.pow(1.0 + rate,year);
				
				System.out.printf("%4d% ,20.2f %14.2f \n",year,amount, rate);
				
			}
			System.out.println();
			rate += 0.01;
		
		}

	}

}
