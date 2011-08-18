package org.weyrauch.csis.examfinal;

public class SavingsAccount {
	
	private double mSavingsAccountBalance;
	private static double  mAnnualInterestRate = .04;
	
	/**
	 * This is the default constructor for a savings account
	 * A savings account cannot be created when there is no 
	 * money to create one. A second constructor should be 
	 * supplied that would allow the class to gather stored
	 * account information
	 * 
	 * @param savingsAccountInitialBalance The initial balance of the savings account upon creation
	 */
	public SavingsAccount(int savingsAccountInitialBalance){
		
		mSavingsAccountBalance = savingsAccountInitialBalance;
		
		
	}
	/**
	 * This functions  modifies the global
	 * Interest Rate for all accounts
	 * 
	 * @param newRate The rate as a integer percentage ex. modifyInterestRate(5)
	 * @return
	 */
	public static boolean modifyInterestRate(int newRate){
		
		// Do a interest check
		// if 
		mAnnualInterestRate = ((double)newRate/100);
		return true;	
	}
	/**
* This functions  modifies the global
	 * Interest Rate for all accounts
	 * 
	 * @param newRate The rate as a double percentage ex. modifyInterestRate(.05)
	 * @return
	 */
	public static boolean modifyInterestRate(double newRate){
		
		// Do a interest check
		// if 
		mAnnualInterestRate = newRate;
		return true;	
	}
	
	/**
	 * Calculate the monthly savings interest
	 * 
	 */
	public void calculateMonthlySavingsInterest(){
		
		
		mSavingsAccountBalance += (mSavingsAccountBalance*mAnnualInterestRate)/12;
		
	}
	
	/*
	 * Calculates the yearly interest
	 * 
	 */
	public void calculateYearlySavingsInterest(){
		
		for(int i = 0; i < 12; i++)
			calculateMonthlySavingsInterest();
		
	}
	
	@Override
	public String toString(){
		
		String savingsAccountString = String.format("%.2f",  mSavingsAccountBalance);
		return savingsAccountString;
	}
	
	

}
