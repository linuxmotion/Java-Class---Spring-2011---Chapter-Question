package org.weyrauch.csis.week15;

import java.util.InputMismatchException;

public class Rectangle {
	
	
	
	private float mLength;
	private float mWidth;
	
	
	
	Rectangle(){
		
		mLength = mWidth = 1;
		
	}
Rectangle(int Width, int Length)  throws InputMismatchException{
		
	if(Verify(Width) == 1F)
		throw new InputMismatchException("Input out of range please enter a number between 0.1 and 20.0");
	if(Verify(Length) == 1F)
		throw new InputMismatchException("Input out of range please enter a number between 0.1 and 20.0");
	
		mLength = Length;
		mWidth = Width;
		
	}
	
	
	public void setWidth(float Width) throws InputMismatchException {
		if(Verify(Width) == 1F)
			throw new InputMismatchException("Input out of range please enter a number between 0.1 and 20.0");
		this.mWidth = Width;
	}
	public float getWidth() {
		return this.mWidth;
	}
	
	
	public void setLength(float Length) throws InputMismatchException  {
		if(Verify(Length) == 1F)
			throw new InputMismatchException("Input out of range please enter a number between 0.1 and 20.0");
		
		this.mLength = Length;
	}
	
	public float getLength() {
		return this.mLength;
	}
	
	private float Verify(float VeriNum){
		
		if((VeriNum <= 0.0) || (VeriNum >= 20.0)){
			return  1.0F;
		}
		return VeriNum;
		
		
	}
	
	
	
	
	
	
	
	

}
