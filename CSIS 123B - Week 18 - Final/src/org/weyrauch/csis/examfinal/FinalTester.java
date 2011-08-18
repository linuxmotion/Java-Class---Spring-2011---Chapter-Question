package org.weyrauch.csis.examfinal;

public class FinalTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		commisionTest();
		System.out.println("");
		savingsTester();
		System.out.println("");
		dateTester();
		
	}
	private static void commisionTest(){
		
		
		int[] TestFigure = { 0,12,45,65,234,234,300,345,1345,2456,4500,5674,6890,9234};
		
		Commisions work = new Commisions(TestFigure.length);
		work.enterEmployeeSales(TestFigure);
		work.determineCommisionRateandSalesTotal();
		work.determineSalariesRanges();
		System.out.print(work.toString());
		
	}
	private static void savingsTester(){
		
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		
		// Calculate the yearly savings interest
		saver1.calculateYearlySavingsInterest();
		saver2.calculateYearlySavingsInterest();
		
		// Print the account balances
		System.out.println("The yearly interest for both accounts is:");
		System.out.println("Account 1 yearly interest balance " + saver1.toString());
		System.out.println("Account 2 yearly interest balance " + saver2.toString());
		
		// modify the interest rate
		SavingsAccount.modifyInterestRate(5);
		
		// Recalculate the monthly savings
		saver1.calculateMonthlySavingsInterest();
		saver2.calculateMonthlySavingsInterest();

		// Print the account balances
		System.out.println("Account 1 balance " + saver1.toString());
		System.out.println("Account 2 balance " + saver2.toString());
	
	}
	public static void dateTester(){
		
		Date Date1 = new Date(9,22,1989);
		Date Date2 = new Date(Date.Months.SEP,22,1989);
		Date Date3 = new Date("sep",22,1989);
		Date Date4 = new Date(265,1989);
		
		// Test case one
		System.out.println(Date1.toString());
		System.out.println(Date2.toString());
		System.out.println(Date3.toString());
		System.out.println(Date4.toString());
		
		Date1.setStringLengthLong(false);
		Date2.setStringLengthLong(false);
		Date3.setStringLengthLong(false);
		Date4.setStringLengthLong(false);
		
		// Test case 2
		System.out.println(Date1.toString());
		System.out.println(Date2.toString());
		System.out.println(Date3.toString());
		System.out.println(Date4.toString());
		
		Date1.setDateStringtoString(true);
		Date2.setDateStringtoString(true);
		Date3.setDateStringtoString(true);
		Date4.setDateStringtoString(true);
		
		// Test case 3
		System.out.println(Date1.toString());
		System.out.println(Date2.toString());
		System.out.println(Date3.toString());
		System.out.println(Date4.toString());
		
		
	}
}