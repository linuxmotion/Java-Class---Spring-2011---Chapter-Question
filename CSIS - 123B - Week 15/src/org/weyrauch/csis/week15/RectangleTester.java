package org.weyrauch.csis.week15;

import java.util.InputMismatchException;
import java.util.Scanner;


public class RectangleTester {

	static Rectangle mRectangle;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		boolean LoopAgain = false;
		mRectangle = new Rectangle();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two number between 0.0 and 20.0");
		do{
			try{
				System.out.println("Please enter the length of the rectangle");
				mRectangle.setLength(input.nextFloat());
				LoopAgain = false;
			}
			catch(InputMismatchException e){
				
				System.out.println(e);
				input.nextLine();
				LoopAgain = true;
				
			}
		}
		while(LoopAgain == true);
		
		do{
			try{
				System.out.println("Please enter the width of the rectangle");
				mRectangle.setWidth(input.nextFloat());
				LoopAgain = false;
			}
			catch(InputMismatchException e){
				
				System.out.println(e);
				input.nextLine();
				LoopAgain = true;
				
			}
	}
	while(LoopAgain == true);
		

		System.out.println("Your number are Width = " + mRectangle.getWidth() + " and Length = " + mRectangle.getLength());
		
		
		
	}
	
	
	

}
