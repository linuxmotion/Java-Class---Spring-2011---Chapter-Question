package org.weyrauch.csis.binarydecimals;

import java.util.Scanner;

/**
 * 
 * @author John Weyrauch
 * @teacher J. Huber
 * @version Midterm question 1
 * @class   CSIS - 123B - Spring 2011
 * @assignment Write an application that an integer containing
 *  only ones and zeros
 * @hint Use the remainder and division 
 *  operators to pick off binary number's digits one at a time, from right to left. 
 *  1001101 = (1*2^7)+(0*2^6)+(0*2^5)+(1*2^4)+(1*2^3)+(0*2^2)+(1*2)
 *  
 */

public class DecEqBin {
	
	
	Scanner  mInput = new Scanner(System.in);
	int mBinaryInteger = 0;
	
	public void runDecEqBinProgram(){
		
		System.out.println("We are about to calculate the decimal equivilent of a binary integer");
		
		printWelcomeMessage();
		retriveBinaryInputFromConsole();
		modulate();
		
		
	}
	
	public void printWelcomeMessage(){
		
		System.out.println("Hell and welcome to the binary integer converter");
		System.out.println("This program will convert a binary integer into ");
		System.out.println("its decimal equivelent. A binary integer is one ");
		System.out.println("The form 101011.");
		System.out.print("Please press enter to continue");
		mInput.nextLine();
		
	}
	
	
	
	public void retriveBinaryInputFromConsole(){
		

		System.out.println("Please enter a binary integer");
		mBinaryInteger = mInput.nextInt();
		
		/*
		 * Validate the integer
		 * make sure it is in the
		 * form 10010101
		 * 
		 * How would you go about doing this you think.
		 * I can't think of anything. 
		 * 
		 */
		
		
	}
	
	public void modulate(){
		
		
		double mDecimalfromBinary = 0, mMultiplier = 0, mDisplayValue;
		int mPower = 1, mAddValue = 0,mRemainder = 0 ; 
		final int mBaseTwo = 2,mBaseTen = 10;
		
		
		System.out.printf("%7s %7s %7s %7s %7s %7s \n", 
				"Remainder","Binaryinteger","CurrentPower","CurrentMultiplier", "ValuetoAddto ->","CurrentDecimalfromBinaryValue");
		
		do{			
			mRemainder = ((int)mBinaryInteger%mBaseTwo);
			
			mMultiplier = (int) Math.pow(mBaseTwo, mPower); // Determine the value to add multiplier
			mAddValue = ((int)mRemainder*(int)mMultiplier); // Calculate the value to add
			mDecimalfromBinary += mAddValue; 				// Add the value to the decimal representation of the binary integer
			mDisplayValue = (mBinaryInteger*(10*Math.pow(mBaseTen, mPower))); // Calculate the display binary value
			mBinaryInteger = ((int)mBinaryInteger/mBaseTen);						  // Decrease the binary decimal to stop the loop or calculate the new integer 
			System.out.printf("%9d %13.0f %12d %17.0f %12d %32.0f \n",
					mRemainder ,mDisplayValue , mPower++, mMultiplier, mAddValue, mDecimalfromBinary);
			// Print the values to the console
			}
		while(mBinaryInteger > 0);
		
		System.out.printf("%100s \n", "Total value");
		System.out.printf("%100.0f \n",	 mDecimalfromBinary);
			
		
	}
	
	

}
