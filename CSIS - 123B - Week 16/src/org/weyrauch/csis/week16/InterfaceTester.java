package org.weyrauch.csis.week16;

public class InterfaceTester implements  InterfaceDemonstrator.OnInterfaceTriggerListener {
	 InterfaceDemonstrator mInterfaceDemonstrator;
	
	public void main(int[] arg, int[] argv){
		
		 mInterfaceDemonstrator = new  InterfaceDemonstrator();
		/*
		 * 
		 * Stuff happens and the trigger is triggered 
		 * Below is how the trigger would be triggered
		 * What happens once it is triggered is defined
		 * within the class that hold the interface 
		 * 
		 */
		
	}

	public void onInterfaceTrigger(Object o, int trigger) {
		/*
		 * 
		 * This is what is defined by the current program
		 * Because the actual trigger is defined here
		 * i can use the  InterfaceDemonstrator in multiple
		 * classes and keep the same backend code. 
		 * 
		 * 
		 */
		
	}

}
