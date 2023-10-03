package com.tnsif.inheritanceprog;

public class StudentSi extends CitizenSi{
	private  int rollno;
	private String collegeName;
	public StudentSi(int rollno, String collegeName) {
		super();
		this.rollno = rollno;
		this.collegeName = collegeName;
	}
	public StudentSi() {
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
	@Override
	public String toString() {
		return "StudentSi [rollno=" + rollno + ", collegeName=" + collegeName + "]";
	}
	
}
