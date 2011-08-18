package org.weyrauch.csis;

public class program {
	
	
	public static void main(String[] args){
		
		Layout one = new Layout();
		//Layout two = new Layout(5,-5,5,-5);
		
		System.out.print(one.returnLayoutLowerLeft());
		System.out.print(one.returnLayoutLowerRight());
		System.out.print(one.returnLayoutUpperRight());
		System.out.print(one.returnLayouUpperLeft());
		
		
		
		//System.out.print(two.returnLayoutLowerLeft());
		//System.out.print(two.returnLayoutLowerRight());
		//System.out.print(two.returnLayoutUpperRight());
		//System.out.print(two.returnLayouUpperLeft());
		
		
	}

}
