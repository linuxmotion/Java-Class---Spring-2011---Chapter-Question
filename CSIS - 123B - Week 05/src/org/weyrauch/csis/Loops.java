/**
 * This week we need to discuss the for loop, the while loop and the do...while loop. 
 *  Tell me which you like the best and why.  Discuss what they do and then tell of 
 *  some differences between them.  Demonstrate your favorite one with some code that 
 *  teaches us all your mastery of the subject.
 * 
 */

/**
 * I would have to say that having a loop that one likes 'best' is not what matters.
 * Knowing when to use the proper loop is more benificial than sticking to one type of loop
 * A Do..While loop can be used to start the and continue the program until the user wishes to exit
 * Next a while loop can return input from the user
 * Which can then be applied to some data to to assign a value
 * 
 */




package org.weyrauch.csis;

import java.util.Scanner;

public class Loops {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Start the program do-while loop(We want to ensure that the program loop is run at least once)
		do{
		

		System.out.println("Please enter the number of integers to create");
		int numInts = input.nextInt();
		int INTS[] = new int[numInts];
		
		// Implement a for loop
		System.out.println("Please enter " + numInts + " integers with each\ninteger followed by a space ");
		for(int i = 0; i < numInts; i++)
		{
			INTS[i] = input.nextInt();
			
		}
		pause();
		
		// Implement a for loop		
		System.out.println("The numbers you have chosen are :");
		for(int g = 0; g < INTS.length; g++)
		{
			System.out.println(INTS[g]);
			
		}
		pause();
		

		// Does the user want to run the program again
		}while(runAgain() == true);
		
		
		
	}
	public static void pause()
	{
		System.out.println("Press enter to continue");
		input.nextLine();
		
	}
	
	public static boolean runAgain(){
		
			
		// Ask the user if they wish to run the program again
			System.out.println("Do you wish to run the program again");
			System.out.println("Yes = 1 , No = 0");
			
			// Retrieve input to determine if the program should run again
			int again = input.nextInt();
			input.nextLine();
			
			// Implement a while
			//perform type and value check on input 
			while(again != 1 && again !=0)
			{
				System.out.println("Do you wish to run the program again");
				System.out.println("Please enter a value below to continue");
				System.out.println("Yes = 1 , No = 0");
				again = input.nextInt();
				
			}
				
			if(again == 1)
			{	
				// If the user wishes to run the program again clear the terminal and start again	
				System.out.println("Thank you. We will run the program again.");
				pause();
				return true;
			}
			else
			{ 
				System.out.println("Thank you for running the program again.");
				pause();
				return false;
			}
	
	}

}
