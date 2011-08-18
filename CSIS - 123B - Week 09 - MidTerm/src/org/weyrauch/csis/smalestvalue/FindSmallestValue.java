package org.weyrauch.csis.smalestvalue;

import java.util.Scanner;



/**
 * 
 * @author John Weyrauch
 * @teacher J. Huber
 * @version Midterm
 * @class   CSIS - 123B - Spring 2011
 * @assignment Write an application that fins the smallest of several integers. 
 * Assume the first value read specifies the number of values to input from the user
 * Object file to find the smallest value for a range of entered integers
 *  
 */

public class FindSmallestValue {
	
	int mArraySize;
	int[] mIntegerArray;
	Scanner input = new Scanner(System.in);;
	boolean mSortAgain = true;
	

	

	
	public void RunFindSmallestInteger(){
		
		SelectArraySizeFromUser();
		RetrieveIntegersFromUser();
		SortArray();
		PrintSmallestValue();
		
		
	}
	
	private void SelectArraySizeFromUser(){
		
		System.out.println("Please enter the size that you want the array to be.");
		System.out.println("(Only Whole numbers will be counted, Real number will be truncated to Whole numbers)");
		mArraySize = input.nextInt();
		
	}
	private void RetrieveIntegersFromUser(){
		
		mIntegerArray = new int[mArraySize];
		System.out.println("Please enter " + mArraySize + " integers.");
		
		for(int i = 0; i < mArraySize; i++){
			
			mIntegerArray[i] = input.nextInt();
		
		}
		
		
	}
	
	
	private void SortArray(){
		
		
		while(mSortAgain && (mArraySize > 1)){
			
			mSortAgain= false;
			for(int i = 0; i < mArraySize; i++){
				
				if( (i + 1) != mArraySize){
					
				 if( mIntegerArray[i] > mIntegerArray[i+1]  ){
					 
					// Store the value of i+1 in tmp variable
					int tmp = mIntegerArray[i+1] ; 		
					// Make i = i+1
					mIntegerArray[i+1] = mIntegerArray[i];   
					// Make i = tmp
					mIntegerArray[i] = tmp;				
					// If we encounter a unsorted array
					// We will need to sort it at least once more
					mSortAgain = true;					
								
				 }	
				 
				}
				
			}
			
		}		
		
	}
	
	
		private void PrintSmallestValue(){
			
			System.out.print("The smallest value that you have entered is: " + mIntegerArray[0] );
			
			
		}
		

}
