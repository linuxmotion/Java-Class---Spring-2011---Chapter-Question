package csis.weyrauch.org;

import java.util.Scanner;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		
		MPGCalculator Trip = new MPGCalculator();
		Trip.Welcome();
		Trip.setNumberMilesAndGallons();
		Trip.calculateMPG();
		Trip.calculateTotalMPG();
		Trip.displayDataToUser();
		// TODO Auto-generated method stub

	}

}
