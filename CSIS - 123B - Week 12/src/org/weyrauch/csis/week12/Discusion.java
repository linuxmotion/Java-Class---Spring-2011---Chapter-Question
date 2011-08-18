//
package org.weyrauch.csis.week12;

import java.util.Scanner; // Import the scanner facilities



public class Discusion {

	private Scanner input = new Scanner(System.in);
	static int mNumThreads; // Created once for all Discusion objects
	private int mWeekNum = 0; // Only this class is allowed to access this variable
	

	
	void setStuf(){
		    mWeekNum = input.nextInt();
			System.out.println("setStuff");
			
		}
	
	
}
