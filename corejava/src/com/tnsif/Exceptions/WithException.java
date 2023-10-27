package com.tnsif.Exceptions;

public class WithException {
public static void divide()
{
	int a=10,b=0,c;
	try {
		c=a/b;//Exception here
	}
	catch(ArithmeticException e) //exception handler
	{
		System.out.println("Excpetion caught "+e.getMessage());
	}
	}
}
