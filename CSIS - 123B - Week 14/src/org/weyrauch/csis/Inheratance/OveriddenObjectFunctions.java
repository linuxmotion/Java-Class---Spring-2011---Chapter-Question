package org.weyrauch.csis.Inheratance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.Math;


public class OveriddenObjectFunctions {
	
	private String LastLogInTime;
	private String LastLogOutTime;
	private String CurrentLogInDate;
	private  int[] CurrentLogInTimes;
	private double CurrentLoginLength;
	private Calendar now;

	/**
	 * @param args
	 */
	OveriddenObjectFunctions(){
		this.now = Calendar.getInstance();
		this.CurrentLogInDate = (now.get(Calendar.YEAR) + ":" + (now.get(Calendar.MONTH) + 1)+ ":" 
				+ now.get(Calendar.DAY_OF_MONTH) +":"+ now.get(Calendar.HOUR_OF_DAY) + ":" 
				+ now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND) + ":" + now.get(Calendar.MILLISECOND));
		
		this.CurrentLogInTimes = new int[5];
		this.CurrentLogInTimes[0] = now.get(Calendar.DAY_OF_MONTH);
		this.CurrentLogInTimes[1] = now.get(Calendar.HOUR_OF_DAY);
		this.CurrentLogInTimes[2] = now.get(Calendar.MINUTE);
		this.CurrentLogInTimes[3] = now.get(Calendar.SECOND) ;
		this.CurrentLogInTimes[4] = now.get(Calendar.MILLISECOND);
		
		this.setCurrentLoginLength(0);
		this.getLastTimes();
		
		
	}
	
	
	
	

	
	private void getLastTimes(){
	
		String fName = "~/.csis/times.db";
		if(new File(fName).exists()){
			File inFile  = new File(fName);  // File to read from.
			try {
				Scanner freader = new Scanner(inFile);
		        freader.useDelimiter(" ");
		        
		        // Asumming that the data is stored as two strings per line separated by a space
		        // This would only grab the last login/logout time
		        LastLogInTime = freader.next();
		        LastLogOutTime = freader.next();
		       

				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("No database file to read last progran login/logoff/usage times");
			}
		}
		else {
			    
		// There was no prevois login/logoffs or the DB was not created
		LastLogInTime = "";
		LastLogOutTime = "";
		
		}
	}
	
	
	@Override
	public String toString(){
	
		String output = "Last Login date: " + LastLogInTime + ", Last Logout date: "+ LastLogOutTime +
		", Current Login time:" + CurrentLogInDate ;
		
		return output;
	}






	/**
	 * @param {@link #CurrentLoginLength} the currentLoginLength to set
	 */
	private void setCurrentLoginLength(double d) {
		CurrentLoginLength = d;
		
	}
	
	
	public void onQuit(){
		
		now = Calendar.getInstance();
		
		String mRightNow = ( now.get(Calendar.DAY_OF_MONTH) +":"+ now.get(Calendar.HOUR_OF_DAY) + ":" 
				+ now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND) + ":" + now.get(Calendar.MILLISECOND));
		
		
		int[] CurrentLogInTimes = new int[5];
		CurrentLogInTimes[0] = now.get(Calendar.DAY_OF_MONTH);
		CurrentLogInTimes[1] = now.get(Calendar.HOUR_OF_DAY);
		CurrentLogInTimes[2] = now.get(Calendar.MINUTE);
		CurrentLogInTimes[3] = now.get(Calendar.SECOND) ;
		CurrentLogInTimes[4] = now.get(Calendar.MILLISECOND);
		
		
		setCurrentLoginLength(getCurrentLoginLength(CurrentLogInTimes));
		
	}






	/**
	 * @return the currentLoginLength
	 */
	public double getCurrentLoginLength(int[] logs) {
		
		double time = 0;
		int down = logs.length;			
		for(int i = 0; i < logs.length; i++){
		
			
				time += (determineTimeElapsedBetween(logs[i], CurrentLogInTimes[i]) * (Math.pow(10,down--)) );
			
				
		     
		}
		
		return CurrentLoginLength;
	}
	
	
	private int determineTimeElapsedBetween(int starttime, int endtime){
		
		int time;
		
		if(starttime != endtime){
			
			time = endtime - starttime;
			
			
		}
	
		
		return 0;
		
		
	}
	
	
	

}
