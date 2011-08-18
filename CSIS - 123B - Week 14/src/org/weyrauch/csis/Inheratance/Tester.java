package org.weyrauch.csis.Inheratance;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	
	static int[] TIME = new int[3];
	static Calendar now = Calendar.getInstance();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TIME[0] = now.get(Calendar.HOUR_OF_DAY);
		TIME[1] = now.get(Calendar.MINUTE);
		TIME[2] = now.get(Calendar.SECOND);
		OveriddenObjectFunctions OverRide = new OveriddenObjectFunctions();
		
		System.out.println("Hello and welcome to the looping program\nThis program will loop in five second intervals.");
	    
		
		
		
		
		boolean secondspassed = false;
		boolean looping = true;
		do{
			
			
			if(secondspassed){
				secondspassed = false;
				System.out.println("Pleas enter 1 to continue or any whole number not 1 to quit");
				Scanner quit = new Scanner(System.in);
				try{
					// Grab the value and check to make sure it is an int
					if(quit.nextInt() != 1)
						looping = false;
					
				}
				catch(InputMismatchException e){
					// Discard invalid input
					quit.nextLine();
					
					
				}
				
			}
			
			secondspassed = specfiedTimePassed();
			
		}
		while(looping == true);
		
		System.out.print(OverRide.toString());
		

	}
	
	private static boolean specfiedTimePassed(){
		
		Calendar now = Calendar.getInstance();
		int[] time = new int[3];
		
		time[0] = now.get(Calendar.HOUR_OF_DAY);
		time[1] = now.get(Calendar.MINUTE);
		time[2] = now.get(Calendar.SECOND);
		
		if(time[0] != TIME[0])
		{
		return true;
		}
		else if (time[1] != TIME[1]){
			
			
			if(((time[2]-TIME[2]) >= 5) || ((time[2]-TIME[2]) <= -5 ) )
				return true;
			else
				return false;
		}
		else if(time[2] != TIME[2]){
			
			if(((time[2]-TIME[2]) >= 5) || ((time[2]-TIME[2]) <= -5 ) )
				return true;
			else
				return false;
			
			
		}
		
			
			
		return false;
		
		
		
	}
	
}
