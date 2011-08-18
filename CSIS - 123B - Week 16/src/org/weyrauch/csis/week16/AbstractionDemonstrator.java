package org.weyrauch.csis.week16;

public abstract  class AbstractionDemonstrator {
	
	public static boolean isMale;
	
	
	protected AbstractionDemonstrator(boolean ismale ){
		
		isMale = ismale;
		
	}
	
	@Override
	public String toString(){
		super.toString();
		
		
		
		return null;
	}
	
	
	public boolean isMaleorFemale(){
		
		
		return this.isMale;
		
	}
	
	public abstract double grossIncome();
	
	
	

}
