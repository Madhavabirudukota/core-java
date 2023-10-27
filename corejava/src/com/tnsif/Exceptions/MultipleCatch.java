package com.tnsif.Exceptions;

public class MultipleCatch {
	public static  void display(){
int a=8,b=0,c;
try {
	c=a/b;
}
	catch(ArithmeticException e)
      {
		System.out.println("Exception caught "+e.getMessage());
	   }
     catch(ArrayIndexOutOfBoundsException e)
       {
    		System.out.println("array Exception  "+e.getMessage());
    	 }
    catch(Exception e)
      {
    	System.out.println(" main Exception  "+e.getMessage());
    	}
finally {
	System.out.println("......this will be executed..... ");
}
}
}