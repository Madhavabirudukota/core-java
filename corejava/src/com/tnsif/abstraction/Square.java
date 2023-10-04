package com.tnsif.abstraction;

public class Square extends Shape{
private float side;
	public Square() {
	super();
	this.side=2.5f;
}

	public Square(float side) {
		super();
		this.side = side;
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area=side*side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
