package com.tnsif.interface2;

import java.util.Scanner;

public class InterfceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int amt;
System.out.println("Enter the amount");
amt=sc.nextInt();
Accounts a;
a=new NonPrime();
a.deliverycharges(amt);
	}

}
