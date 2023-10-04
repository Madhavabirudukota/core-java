package com.tnsif.inheritanceprog;

public class Student extends Citizen{
	private  int rollno;
	private String collegeName;
	public Student(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	
	public Student(String name, long aadharno, String address, long phoneno) {
		super(name, aadharno, address, phoneno);
		// TODO Auto-generated constructor stub
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	//@Override
	//public String toString() {
		//return "StudentSi [rollno=" + rollno + ", collegeName=" + collegeName + "]";
	//}
	
}
