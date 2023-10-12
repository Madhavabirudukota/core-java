package com.tnsif.StaticPrograms;
//program to demonstrate static variable
public class Employee {
private int id;
private String name;
//declaring static variable
static String companyName="TNS";
//declare parametrised constructor
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ",company="+ companyName+"]";
}
}
