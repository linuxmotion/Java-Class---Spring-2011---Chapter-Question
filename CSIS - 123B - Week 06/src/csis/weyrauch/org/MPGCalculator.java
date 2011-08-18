/**
 * John Weyrauch
 * Febuary 26 2011
 * 
 *Create a class that allows the input to accept the amount of gallons a person driven
 * and the miles driven that person has driven for the entered amount of gallons.
 * This class should also be able to accept more than one gallons/miles combinations
 * 
 * 
 */
	



package csis.weyrauch.org;

import java.util.Scanner;

public class MPGCalculator {
	
	static Scanner input = new Scanner(System.in);
	
	static int   ENTRIES;
	static int   []MILES;
	static int   []GALLONS;
	static float []MILESPERGALLONS;
	
	MPGCalculator(){
		
		ENTRIES = 0;
	}
	
	public void displayDataToUser(){
		/**
		 * This function is a combination of the gallons used and the miles driven
		 * It should display a three column output containing the 
		 * gallons used, the miles driven and the miles per gallon of that combination
		 * in the third column the total average miles per gallon should be calculated
		 * the total miles per gallons should be displayed after the last entry in
		 * the corresponding field
		 *   Miles | Gallons | Average       
		 *  ----------------------
		 *   240   |   12    |  30         
		 */
		if(ENTRIES == 0 || MILES == null || GALLONS == null || MILESPERGALLONS == null){
			System.out.println("Their are no entries to process program terminating .....");
			System.exit(-1);
			}
		
		
		System.out.println("\tMiles Driven\t|\tGallons Consumed\t|\tMiles per Gallon\t");
		System.out.println("___________________________________________________________________________________");
		for(int i = 0; i < ENTRIES; i++)
		{
		System.out.println("\t" + MILES[i] + "\t\t\t\t" + GALLONS[i] + "\t\t\t\t" + MILESPERGALLONS[i] );
			
		}
		System.out.println("___________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\tTotal Miles Per Gallon:");
		System.out.println("\t\t\t\t\t\t\t\t\t" + calculateTotalMPG() );
		
		
		
	}
	
	
	
	private void setNumberOfEntries(int numEntries){
		/**
		 * This function accepts an integer as it argument
		 * This argument should be the number miles/gallons combinations
		 * 
		 */
		ENTRIES = numEntries;
		
		if(ENTRIES == 0 ){
			System.out.println("Their are no entries to process program terminating .....");
			System.exit(-1);
			}
		
		/**
		 *  now that the number of entries is know 
		 *  the number of gallon miles combinations can be set 
		 * 
		 */
		MILES = new int[ENTRIES];
		GALLONS = new int[ENTRIES];
		MILESPERGALLONS = new float[ENTRIES];
	}
	
	private void pushMilesGallons(){
		

		
	}
	
	
	public void setNumberMilesAndGallons(){
		
		System.out.println("Please enter the desired number of miles and gallons combinations:");
		System.out.println("To quit enter -1 for either miles or gallons");
		
		int num = input.nextInt();
		int reps = 0;
		int tmp = 0;
		
		setNumberOfEntries(num);
		
		while(reps != num && reps >= 0)
		{
			System.out.println("Please enter milage number "+ (reps+1) + ":" );
		
			tmp = input.nextInt() ;	
			MILES[reps]= (tmp == -1) ? 0 : tmp;
		
			if(tmp != 0){
			System.out.println("Please enter the number of gallons for milage "+ (reps+1) + ":" );	
			tmp = input.nextInt() ;	
			GALLONS[reps] = (tmp == -1) ? 0 : tmp;
			reps++;
			}
			

			if(tmp == -1)num = reps;
		}
		
		
		
		/*
		for(int i = 0; i < ENTRIES; i++){
			System.out.println("Please enter milage number "+ (i+1) + ":" );
			MILES[i] = input.nextInt();
			System.out.println("Please enter the number of gallons for milage "+ (i+1) + ":" );
			GALLONS[i] = input.nextInt();
			
		}
		*/
		
	}
	
public  float calculateTotalMPG(){
		
	float mpg = 0;
		
		for(int i = 0; i < ENTRIES; i++)
		{
			mpg += MILESPERGALLONS[i];
				
		}
			
	
	return (mpg/ENTRIES);
		
	}

public  void calculateMPG(){
			
		for(int i = 0; i < ENTRIES; i++)
		{
			MILESPERGALLONS[i] = (float)MILES[i]/(float)GALLONS[i];
				
		}
		
	
		
	}

public void Welcome(){
	
	System.out.println("Hello and welcome to the miles per gallon averager");
	System.out.println("It will ask you for both the mileage that you have");	
	System.out.println("driven and the gallons it took to drive that amount.");
	System.out.println("");
	System.out.println("");
}
	
	

}
