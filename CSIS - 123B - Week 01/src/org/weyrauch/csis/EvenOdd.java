package org.weyrauch.csis;

import java.util.Scanner;



public class EvenOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initialize input reception
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter five integers.\nSeperated by a space.\n");
		// Initialize integers to compare
		int one   = input.nextInt();
		int two   = input.nextInt();
		int high1; // Integer to store highest compared value
		int low1; // Integer to store lowest compared value
		
		int three = input.nextInt();
		int four  = input.nextInt();
		int high2; // Integer to store highest compared value
		int low2; // Integer to store lowest compared value
		
		
		int five  = input.nextInt();
		
		/** 
		 * Compare the integers 
		 * Return the highest 
		 * and smallest integer values
		 */
		
		// I should handle the case if they are equal
		// But if they are then the value return does not matter
		if(one > two ){
			high1 = one; 
			low1 = two;
		}
		else{
			
			high1 = two;
			low1 = one;
		}
		
		if(three > four ){
			high2 = three; 
			low2 = four;
		}
		else{
			
			high2 = four;
			low2 = three;
		}
		
		// If statements to determine highest value
		if(high1 > high2 ){
			if(high1 > five ){
				System.out.println("The highest number is " + high1);
			}
			else{
				System.out.println("The highest number is " + five);
			}
		}
		else{
			if(high2 > five ){
				System.out.println("The highest number is " + high2);
			}
			else{
				System.out.println("The highest number is " + five);
			}
		}
		
		// If statements to determine lowest value
		if(low1 < low2 ){
			if(low1 < five ){
				System.out.println("The lowest number is " + low1);
			}
			else{
				System.out.println("The lowest number is " + five);
			}
		}
		else{
			if(low2 < five ){
				System.out.println("The lowest number is " + low2);
			}
			else{
				System.out.println("The lowest number is " + five);
			}
		}
		


	}

}
