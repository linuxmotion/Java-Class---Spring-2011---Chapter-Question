package org.weyrauch.csis;

import java.util.Scanner;

public class InvoiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the item description");
		String desc = input.nextLine();
		
		System.out.println("Please enter the item number");
		String partNum = input.nextLine();
		
		System.out.println("Please enter the quatity of items");
		int quanity = input.nextInt();
		
		System.out.println("Please enter the price per item");
		double pricePer = input.nextDouble();
		
		Invoice invoice = new Invoice(partNum,desc,quanity,pricePer);
		
		System.out.println("Your total invoice amount is:" + invoice.getInvoiceAmount());

	}
	
	
	
	

}
