package org.weyrauch.csis.multiples;

public class Multiples {
	
	
	
	
	public boolean isMultiple(int Arg1, int Arg2){
		
		/* 
		 * Determine if the second number is a multiple of the first
		 * To do this, I will take the Arg1%Arg2 and Arg2%Arg1
		 * If these both equal zero then the numbers are 
		 * multiples of each other
		 *
		 * We test both cases because at most one modulus case is always zero
		 * Because one and only one number is bigger than the other
		 * Therefore Arg1 > Arg2 or Arg1 < Arg2 but not both.
		 * 
		 * if Arg1 > Arg2 then Arg1%Arg2!=0 if Arg1 is a multiple
		 * of Arg2.
		 * 
		 * If Arg2 > Arg1 then Arg1%Arg2 always equal 0.
		 * 
		 */
		// If one argument is zero it can't be a constant multiple 
		if((Arg1 == 0 || Arg2 == 0) && (Arg1 != Arg2))
			return false;
		// Unless the other argument is also zero
		// Which of course leads to argument one equaling argument two
		// in which case the integer is a constant multiple of the other
		// or one argument equaling one, in which case they are always multiples
		else if( ( Arg1 == Arg2 ) || (Arg1 == 1 || Arg2 == 1) )
				return true;
		
		else
		{
		
		
			 /*
			 * We test both case Because one and only one number 
			 * is bigger than the other.
			 * Therefore Arg1 > Arg2 or Arg1 < Arg2 but not both.
			 * 
			 * If Arg1 > Arg2 then Arg1%Arg2 = 0 if Arg1 is a multiple
			 * of Arg2.
			 * 
			 * If Arg2 > Arg1 then Arg2%Arg1 = 0 if Arg2 is a multiple
			 * of Arg1.
			 * 
			 */
			
		int mModOne;
		if(Arg1 > Arg2){
			
			mModOne = Arg1%Arg2;
			
		}
		else{
			
			mModOne = Arg2%Arg1;
			
		}
		
			// If the remainder of the modulus is one of the arguments or zero
			// then the argument has at least one multiple and 
			// Therefore the argument are multiple of each other
			if( ( mModOne == Arg1 || mModOne == Arg2) || (mModOne == 0))
				return true;
			else 		
			   return false;
		}
		
	}
	
	
	

}
