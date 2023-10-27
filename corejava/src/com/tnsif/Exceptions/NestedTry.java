package com.tnsif.Exceptions;
//program to nested try block
public class NestedTry 
{
public  static void check()
{
	String str="tns";
	int slength=str.length();
	System.out.println(" the length of the string is  "+slength);
	String anotherString="madhava";
	int y=6;
	try// outer try block
	{
	//	int z=y/0;
	try // inner try block
	{
		System.out.println(str.charAt(8));
	//	System.out.println(z);
	}
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("index exception "+e.getMessage());
		
	}
	}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic Exception "+e.getMessage());
	}
	catch(NullPointerException e)
	{
		System.out.println("Null pointer exception Exception "+e.getMessage());
	}
}
}
