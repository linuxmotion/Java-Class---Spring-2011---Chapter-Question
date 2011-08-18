package org.weyrauch.csis.week16;

import java.awt.AWTEvent;
import java.awt.Canvas;


public class InterfaceDemonstrator {
	
	OnInterfaceTriggerListener mOnInterfaceTriggerListener;
	
	
	public interface OnInterfaceTriggerListener{
		
		public static int GRABBED_STATE_NONE = 0;
		public static int GRABBED_STATE_GRABBED = 1;
		
		public void onInterfaceTrigger(Object o, int trigger);
		
		
		
	}
	
	public void onDraw(Canvas canvas){
		
		// Stuff that would put you the screen together
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
	}
	
	public void onTouch(AWTEvent event){
		
		
		
		/*
		 * 
		 * Handles touch events
		 * and causes the view to be drawn again
		 * 
		 */
		
		
		
	}
	
	/**
     * Registers a callback to be invoked when the interface
     *  is "triggered" 
     *
     * @param l the OnMusicTriggerListener to attach to this view
     */
    public void setOnTriggerListener(OnInterfaceTriggerListener l) {
    	this.mOnInterfaceTriggerListener = l;
    }
	
	
    /**
     * Dispatches a trigger event to our listener.
     */
    private void dispatchTriggerEvent(int whichTrigger) {
    	
        if (mOnInterfaceTriggerListener != null) {
            
        		mOnInterfaceTriggerListener.onInterfaceTrigger(this, whichTrigger);
            
        }
    }
    
    
	

}
