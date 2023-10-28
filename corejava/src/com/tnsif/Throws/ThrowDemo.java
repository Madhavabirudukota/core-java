package com.tnsif.Throws;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println(" enter the roll no");
     int rno=sc.nextInt();
     if(rno<0)
     {
        throw new ArithmeticException("roll number cannot be zero");
     }
     else
     {
    	 System.out.println("valid Roll number");
     }
	}     
}
