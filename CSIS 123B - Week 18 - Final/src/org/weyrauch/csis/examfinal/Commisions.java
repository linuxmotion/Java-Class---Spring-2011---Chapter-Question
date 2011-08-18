package org.weyrauch.csis.examfinal;

public class Commisions {
	
	private double mCommissionRate = .09;
	private final int mBasePay = 200;
	private final int RANGE = 9;
	private final int[] mSalesFiguresRanges = new int[RANGE];
	private int[] mSalesFiguresRangesCounter = new int[RANGE];
	private int[] mWeeklySalesFigures;
	private int mNumberOfEmplyees;
	private int[] mEmplyeeSalesTotal;
	
	public Commisions(int numEmployees){
		
		mNumberOfEmplyees = numEmployees;
		mEmplyeeSalesTotal = new int[numEmployees];
		mWeeklySalesFigures = new int[numEmployees];
		
		setUpSalesFigures();
		

		
	}
	
	/**
	 * Generic initializer function
	 * 
	 * 
	 */
	public void setUpSalesFigures(){
		
		
		
		int base = mBasePay;
		int range = 100;
		for(int i = 0; i < mSalesFiguresRanges.length; i++ ){
			
			mSalesFiguresRanges[i] = base;
			base += range;
			
		}
		
		for(int i = 0; i < mNumberOfEmplyees; i++ ){
			mWeeklySalesFigures[i] = 0;
		}
		
		
		
	}
	
	/**
	 * Takes the employess weekly sales and stores them
	 * 
	 * @param weeklySales takes the employees weekly sales as a array
	 */
	public void enterEmployeeSales(int[] weeklySales){
		
		
		for(int i = 0; i < mNumberOfEmplyees; i++ )
		{
			mWeeklySalesFigures[i] = weeklySales[i];
			
		}
		
		
	}
	
	/**
	 * Determines the commision and total pay for each employee.
	 * 
	 * 
	 */
	public void determineCommisionRateandSalesTotal(){
		
		for(int i = 0; i < mNumberOfEmplyees; i++){
			int commision = (int) (mWeeklySalesFigures[i] * mCommissionRate);
			
			mEmplyeeSalesTotal[i] = (int) (commision + mBasePay);
		}
		
		
		
		
		
	}
	
	/**
	 * Determines the salry panges
	 * 
	 * 
	 */
	public void determineSalariesRanges(){
		
		
		
		for(int i = 0; i < mNumberOfEmplyees; i++){
			
			
			for(int z = 0; i < mNumberOfEmplyees; z++){
				
				if(z == (mSalesFiguresRanges.length-1))
				{
					mSalesFiguresRangesCounter[z]++;
					break;
				}
				else{
					if((mEmplyeeSalesTotal[i] >= mSalesFiguresRanges[z]) 
							&& (mEmplyeeSalesTotal[i] <= (mSalesFiguresRanges[z+1]-1)) ){
						
						mSalesFiguresRangesCounter[z]++;
						break;
					}
					
				}
			}
			
			
			
		}
		
		
		
	}
	
	
	@Override
	public String toString(){
		
		
		String salesPrint = String.format("%s %25s  %s","Earnings", "Number of People", "\n"); 
		
		
		for(int i =0 ; i < mSalesFiguresRanges.length; i++){
			
			int number = mSalesFiguresRangesCounter[i];
			if(i == (mSalesFiguresRanges.length-1))
			{
				salesPrint += String.format("%d%s %27d %s",mSalesFiguresRanges[i],"+", number, "\n");
				
			}
			else{
				
				
				salesPrint += String.format("%d%s%d %25d %s",mSalesFiguresRanges[i], "-", (mSalesFiguresRanges[i+1]-1) , number ," \n");
			}
		}
		return salesPrint;
	}
	
	

}
