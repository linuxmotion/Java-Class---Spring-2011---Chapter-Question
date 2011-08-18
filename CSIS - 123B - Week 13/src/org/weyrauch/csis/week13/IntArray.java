package org.weyrauch.csis.week13;

public class IntArray {
	
	
	public int[] setArray(int[] mIntArray){
		
		for (int i = 0; i < mIntArray.length; i++){
			
			mIntArray[i] = 0; 
			
		}
		
		return mIntArray; 
		
	}
	public int[]  setArray(int[] mIntArray, int mArrayNumber){
		
		for (int i = 0; i < mIntArray.length; i++){
			
			mIntArray[i] = 0; 
			
		}
		
		return mIntArray;
		
	}
	
	public int[]  addToAllElements(int[] mIntArray, int mToAdd ){
		
		
		for (int i = 0; i < mIntArray.length; i++){
			
			mIntArray[i] += mToAdd; 
			
		}
		

		return mIntArray;
		

		
	}
	
	public void displayElementsInColumnFormat(int[] mIntArray){
		
	
		for(int number : mIntArray){
			System.out.println(number);
		}
		
	}
	

}
