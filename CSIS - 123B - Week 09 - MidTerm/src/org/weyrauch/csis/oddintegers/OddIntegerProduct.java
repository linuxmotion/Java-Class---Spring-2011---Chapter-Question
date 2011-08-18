package org.weyrauch.csis.oddintegers;




/**
 * 
 * @author John Weyrauch
 * @teacher J. Huber
 * @version Midterm
 * @class   CSIS - 123B - Spring 2011
 * @assignment Write an application that calculates the product of the odd integers from 1 to 15
 * 
 *  
 */

public class OddIntegerProduct {
	
	int mProduct = 1;
	
	public void RunOddIntegerProgram(){
		
		CalculateProduct();
		DisplayOddProducts();
		
		
	}
	
	private void DisplayOddProducts() {
		
		System.out.println("The product of the odd integers between 1 and 15 \nis: " + mProduct);
		
	}

	private void CalculateProduct(){
		
		
		for(int i = 1; i <= 15; i++){
			
			int mRemainder = i%2; // If the remainder is 1 then it is an odd number
			
			if( (mRemainder == 1) || (i == 1) )
			mProduct *= i;
				
			
		}
		
		
	}
	
	
	
	

}
