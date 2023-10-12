package com.tnsif.staticprograms1;
//program to demonstrate static method and block
public class Myclass {
private int section;//instance variable
private static int srno;//static variable
//static Block
static {
	System.out.println("........static Block....");
	srno=100;
}
//default Constructor
public Myclass() {
	System.out.println("......default constructor....");
	srno++;
	section++;
}
static void display()
{
	System.out.println("serial no "+srno);
	}
@Override
public String toString() {
	return "Myclass [section=" + section + "]";
}

}
