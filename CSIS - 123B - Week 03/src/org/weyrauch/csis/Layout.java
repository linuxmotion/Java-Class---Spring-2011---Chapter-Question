package org.weyrauch.csis;


public class Layout{
private int ll;
private int lr;
private int ul;
private int ur;

   //Defualt explicit constructor

   Layout(){
   //There is no layout positions
  ll=lr=ul=ur=0;

   }
   
   Layout(int LowerL, int LowerR, int UpperL, int UpperR){
    //There is no layout positions
       ll= LowerL;
       lr= LowerR;
      ul=UpperL;
      ur=UpperR;

    }

int returnLayoutLowerLeft(){
	return ll;
	   
	   
   }   int returnLayoutLowerRight(){
	return lr;
	   
	   
   }
   int returnLayouUpperLeft(){
		return ul;
		   
		   
	   }
   int returnLayoutUpperRight(){
		return ur;
		   
		   
	   }



}