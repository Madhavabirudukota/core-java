package com.tnsif.interface2;

public class NonPrime implements Accounts {
	int amt;
	public NonPrime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NonPrime(int amt) {
		super();
		this.amt = amt;
	}


	@Override
	public String toString() {
		return "NonPrime [amt=" + amt + "]";
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	@Override
	public void deliverycharges(int amt) {
		// TODO Auto-generated method stub
		System.out.println("the amount is "+amt);
	}

}
