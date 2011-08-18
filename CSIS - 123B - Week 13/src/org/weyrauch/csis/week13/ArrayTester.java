package org.weyrauch.csis.week13;


public class ArrayTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int TEN = 10;
		int FIVE = 5;
		int FIVETEEN = 15;
		
		int[] counts = new int[TEN];
		int[] bonus  = new int[FIVETEEN];
		int[] bestScores = new int[FIVE];
		
		IntArray modifier = new IntArray();
		
		counts = modifier.setArray(counts);
		bonus = modifier.setArray(bonus,2);
		bestScores = modifier.setArray(bestScores,13);
		
		counts = modifier.addToAllElements(counts, 6);
		bonus =  modifier.addToAllElements(bonus, 1);
		bestScores =  modifier.addToAllElements(bestScores, 8);
		
		modifier.displayElementsInColumnFormat(counts);
		modifier.displayElementsInColumnFormat(bonus);
		modifier.displayElementsInColumnFormat(bestScores);
		
		

	}

}
