package org.weyrauch.csis.multiples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplesTester {

	
	static boolean AGAIN = false;
	static Scanner input = new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintProgramMessage();
		
		do{
		
		Multiples Compare = new Multiples();
		int INTS[] = new int[2];
		System.out.println("Please enter two integers, seperated by a space");
		
		
		INTS = retriveIntsAndValidate();
		
		input.nextLine();
		
		
				if(Compare.isMultiple(INTS[0], INTS[1]))
					System.out.println("Your integers," + INTS[0] +" and " + INTS[1] + " are multiples of each other");
				else
					System.out.println("Your integers," + INTS[0] +" and " + INTS[1] + " are not multiples of each other");
				
				
				System.out.println("Would you like to repeat the program Yes = 1 , No = 0");
				
			
		}
		while(runAgain());
		
		PrintExitMessage();
		
	}
	
	private static int [] retriveIntsAndValidate(){
		
		int []IntArray = new int[2];
	
		

		boolean  intloop = true;
		do{
			try{
				
				IntArray[0] = input.nextInt();
				IntArray[1] = input.nextInt();
				intloop = false;
			}
			catch (InputMismatchException inputMismatchException){
				intloop = true;
				System.out.println("Please enter two integers.");
				input.nextLine();
				
			}
		}while(intloop == true);
		
		return IntArray;
		
	}
	
	private static void PrintProgramMessage(){
		
		System.out.println("Hello and welcome to Multiple Tester, the multiple tester program"); 
		System.out.println("This program accepts a pair of integers");
		System.out.println("that will determine if they are multiples");
		System.out.println("of one another");
	}
private static void PrintExitMessage(){
		
		System.out.println("Thank you for using Multiple tester"); 
		System.out.println("............");
		System.out.println("...........");
		System.out.println("..........");
		System.out.println(".........");
		System.out.println("........");
		System.out.println("......");
		System.out.println("....");
		System.out.println("...");
		System.out.println("..");
		System.out.println(".");
		System.out.println("");
	}
	
	private static boolean runAgain(){
		int run = 0;
		boolean  intloop = true;
		do{
			try{
				
				run = input.nextInt();
				intloop = false;
			}
			catch (InputMismatchException inputMismatchException){
				intloop = true;
				System.out.println("Please enter an integer");
				System.out.println("Would you like to repeat the program Yes = 1 , No = 0");
				input.nextLine();
				
			}
		}while(intloop == true);
		
		if(run == 1)
			return true;
		else
			return false;
	}

}
