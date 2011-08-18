package org.weyrauch.csis.examfinal;

import java.util.InputMismatchException;


/**
 * Used to create a Date object. Simplistic in function
 * but allows the conversion of different dates.
 * 
 * 
 * @author John A Weyrauch
 *
 */
public class Date {
	private final static int  DEFAULT = 1; 
	int mDay;
	String mMonthString;
	int mMonth;
	int mYear;
	int mDayofYear;
	
	/**
	 * Used to determine how the date should be displayed
	 */
	boolean mShortDate = false;
	/**
	 * Used to determine how the date should be displayed
	 */
	boolean mLongdate = true;
	/**
	 * Used to determine how the date should be displayed
	 */
	boolean mLongdateString = false;
	
	
	private final int[] MONTHS = {	31,28,31,30,31,30,31,31,30,31,30,31};
	private final int[] MONTHSDAYS = new int[MONTHS.length];
	private final String  MONTHSTRINGS[] ={"jan","feb","mar","apr","may","jun","jul","aug","sep", "oct","nov","dec"};
	final String  FULLMONTHSTRINGS[] = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
	
	public enum  Months{JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC, DEFAULT };
	
	
	
	/**
	 * Creates a specific date and stores it
	 * It can return the date in a numeric
	 * and strings form with {@link toString}.
	 * 
	 * @param DayofYear The day number in the year, between 1 and 365
	 * @param Year The number of the year, between 1 and 
	 * @throws InputMismatchException
	 */
	public Date(int DayofYear, int Year)throws InputMismatchException{
		this(DEFAULT,DEFAULT ,Year);
		mLongdate = false;
		mShortDate = true;
		
		validateandSetDayofYear(DayofYear);
		determineMonthofYear(DayofYear);
		
		for(int i = 0; i < mMonth; i++){
			
			mDay = mDayofYear - MONTHSDAYS[i];
			
		}
		this.determineStringfromMonth();
		
		
		
	}
	
	/**
	 * * Creates a specific date and stores it
	 * It can return the date in a numeric
	 * and strings form with {@link toString}.
	 * 
	 * 
	 * @param month Month of the year in integer form
	 * @param day Day of month in integer form
	 * @param year Number of year in integer form
	 * @throws InputMismatchException
	 */
	public Date(int month, int day, int year) throws InputMismatchException{
		intilizeMonthDaysandStrings();
		
		validateandSetMonth(month);
		validateandSetDay(day);
		validateandSetYear(year);
		
		determineDayOfYear(day);
		determineStringfromMonth();
	}
	
/**
	 * 
	 * Creates a specific date and stores it
	 * It can return the date in a numeric
	 * and strings form with {@link toString}.
	 * 
	 * @param Month Month of the year in string form. Must have at least the first three letters of the month
	 * @param DayofMonth Day of month in integer form
	 * @param Year Number of year in integer form
	 * @throws InputMismatchException
	 */
	public Date(String Month, int DayofMonth, int Year)throws InputMismatchException{
		this(Months.DEFAULT,DayofMonth,Year );
		determineMonthfromString(Month);
		int MonthOffset = 0; 
		for(int i = 0; i < mMonth-1; i++){
		
			MonthOffset += MONTHS[i];
			
			
		}
		mDayofYear =  MonthOffset + DayofMonth;
		
		
		
	}
	/**
	 * 
	 * Creates a specific date and stores it
	 * It can return the date in a numeric
	 * and strings form with {@link toString}.
	 * 
	 * @param Month Month of the year in Dat.Month form
	 * @param DayofMonth Day of month in integer form
	 * @param Year Number of year in integer form
	 * @throws InputMismatchException
	 */
	public Date(Months Month, int DayofMonth, int Year) throws InputMismatchException{
		intilizeMonthDaysandStrings();
		switch(Month){
		case DEFAULT: break;
		case JAN: mMonth = 1;break;
		case FEB: mMonth = 2;break;
		case MAR: mMonth = 3;break;
		case APR: mMonth = 4;break;
		case MAY: mMonth = 5;break;
		case JUN: mMonth = 6;break;
		case JUL: mMonth = 7;break;
		case AUG: mMonth = 8;break;
		case SEP: mMonth = 9;break;
		case OCT: mMonth = 10;break;
		case NOV: mMonth = 10;break;
		case DEC: mMonth = 12;break;
			
		}
	
		determineStringfromMonth();
		this.validateandSetDay(DayofMonth);
		this.validateandSetYear(Year);
		
		
		int MonthOffset = 0; 
		for(int i = 0; i < mMonth-1; i++){
		
			MonthOffset += MONTHS[i];
			
			
		}
		mDayofYear =  MonthOffset + DayofMonth;
		
		
	}

	/**
	 * A generic initializer function the initializes 
	 * the days passed for whatever month and all months before
	 * 
	 */
	public void intilizeMonthDaysandStrings(){
		 
		 
		for(int i = 0; i < (MONTHS.length-1); i++){
			MONTHSDAYS[i+1] += MONTHSDAYS[i] + MONTHS[i];
		}
		
	}

	/**
	 * 
	 *  Validates and set the Month
	 *  
	 * @param month
	 * @return returns true if the month was set 
	 */
		private void validateandSetMonth(int month) {
			
			if(month < 1 || month > 12){
			
				
				throw new InputMismatchException("Please enter a valid month date 1 through 12");
			
			}
			else{
				mMonth = month;
				determineStringfromMonth();
				
			}
			
			
			
		}

	/**
	 * Validate and set the Year
	 * 
	 * @param year
	 * @return @return returns true if the year was set 
	 */
	private void validateandSetYear(int year){
		
			if(year <= 0 ){
		
				throw new InputMismatchException("Please enter a value greater than 0 for " +
				"the year\nDate in B.C are not handled\n");
		
		}
		else{
			mYear = year;
			
			
		}
		
		
	}

	/**
		 * 
		 * Validate and set the day
		 * 
		 * @param day
		 * @return @return returns true if the day was set 
		 */
		private void validateandSetDay(int day ){
			
			if((day < 1 || day > 31) || (mMonth == 2 && day > 28) 
					||(mMonth == 4 && day > 30)||(mMonth == 6 && day > 30) 
					||(mMonth == 9 && day > 30)||(mMonth == 11 && day > 30)){
			
				
			String throwString = String.format("\nPlease enter a valid day between %d and %d.\n" +
		
				"If you are entering a %s please make it between %d and %d.\n" +
				"If you are entering a day for %s, %s, %s, or %s please enter a data between %d and %d.\n", 1,  31, FULLMONTHSTRINGS[1],1,28, FULLMONTHSTRINGS[3], FULLMONTHSTRINGS[5] , FULLMONTHSTRINGS[8] , FULLMONTHSTRINGS[10], 1, 30);
			
				throw new InputMismatchException(throwString);
				
		
			}
			else{
				mDay = day;
				
			}
			
		}

	private void validateandSetDayofYear(int DayofYear){
		
		if(DayofYear < 0 || DayofYear > 365)throw new InputMismatchException("\nPlease enter a valid day between 1 and 365");
		
		mDayofYear =  DayofYear;
		
	}

	/**
	 * Used to determine if two numbers are less than each other
	 * 
	 * @param thisnumber
	 * @param lessthanthisnumber
	 * @return false if the first number is bigger than the second number
	 */
	static private boolean lessthan(int thisnumber, int lessthanthisnumber){
		
		
		if(thisnumber > lessthanthisnumber){
			return false;
		}
		
		return true;
	}
	
	/**
	 * Determines the day of the year. The month MUST be known to 
	 * properly asses the date
	 * 
	 * @param DayofMonth
	 */
	private void determineDayOfYear(int DayofMonth){
		
		int MonthOffset = 0; 
		for(int i = 0; i < mMonth-1; i++){
		
			MonthOffset += MONTHS[i];
			
			
		}
		mDayofYear =  MonthOffset + DayofMonth;
		
	}

	private void determineMonthofYear(int dayOfYear){
		
		
	
		for(int i = 0; i < MONTHS.length; i++){
			
			if( lessthan(dayOfYear, MONTHSDAYS[i+1]) ){
			this.mMonth = i+1;
			break;
			}
			
		}
		
		
	}

	
	/**
	 * Determines the month number from a string representation
	 * 
	 * 
	 * @param Month The string representing the month 
	 */
	private void determineMonthfromString(String Month){
		
		Month = Month.toLowerCase();
		for(int i = 0; i< MONTHS.length; i++){
			
			if(Month.indexOf(MONTHSTRINGS[i]) >= 0){
				
				mMonth = i+1;
				determineStringfromMonth(); /* Called so that the string is the full name and not an abbreviation*/
			}
		}
	}
	
	/**
	 * Determines the given dates string representation of the given month
	 * CAn only be used once the month number is known
	 * 
	 */
	private void determineStringfromMonth(){

		
		for(int i =0; i < MONTHS.length; i++){
			
			if(mMonth == (i+1)){
				mMonthString = FULLMONTHSTRINGS[i];
				}
			
		}
	}
	/**
	 *  Prints the string representation of the Date object
	 * Return three types of strings for all creation types
	 * [MM/DD/YYYY][MonthString DD, YYYY][DDD YYYY]
	 */
	@Override
	public String toString(){
		
		String dateString  = "";
		if(mLongdate){
			
			dateString = "The date is: " + mMonth + "/" + mDay + "/" + mYear;
			
		}
		if(mLongdateString){
			
			dateString = "The date is: " + mMonthString + " " + mDay + ", " + mYear;
		}
		
		if(mShortDate){
			
			dateString = "The date is: " + mDayofYear + " " + mYear;
		}
		
		return dateString;
	}
	
	/**
	 * Set the date format the the long date string format or long date format
	 * 
	 * @param longdate If true then the date will be displayed in long format 'String DD, YYYY'
	 * or else the default is long format 'MM/DD/YYYY' 
	 */
	public void setDateStringtoString(boolean stringdate){
		

		mLongdate = !stringdate;
		mShortDate = false;
		mLongdateString = stringdate;
		
	}
	
	/**
	 * 
	 * 
	 * @param longdate If false then the date will be displayed in sort format 'DDD YYYY' 
	 * the default is long format 'MM/DD/YYYY'
	 */
	public void setStringLengthLong(boolean longdate){
		
		mLongdate = longdate;
		mShortDate = !longdate;
		mLongdateString = false;
		
	}
	
}
