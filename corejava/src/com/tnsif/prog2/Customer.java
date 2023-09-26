package com.tnsif.prog2;
//program to demonstrate constructor 
public class Customer {
private String customerName;
private int customerId;
private String city;
 public Customer()
 {
	 
 }
 public Customer(String customerName,int customerId,String city)
 {
	 this.customerName=customerName;
	 this.customerId=customerId;
	 this.city=city;
 }
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	customerName = customerName;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", city=" + city + "]";
}
 
}
