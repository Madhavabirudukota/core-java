package com.tnsif.prog2;

import java.util.Scanner;

public class CustomerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1=new Customer("madhava",21,"mrt");
		Scanner sc=new Scanner(System.in);
		String name,city;
		int id;
		System.out.println("enter the name");
		name=sc.nextLine();
		System.out.println("enter the id");
		id=sc.nextInt();
		System.out.println("enter the city");
		city=sc.nextLine();
		System.out.println(c1);

	}

}
