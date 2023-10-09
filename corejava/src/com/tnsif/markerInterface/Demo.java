package com.tnsif.markerInterface;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		if(s instanceof Regesterable)
			System.out.println("Student Registered");
		else
			System.out.println("Student not Registered");
		
	}

}
