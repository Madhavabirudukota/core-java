package com.tnsif.abstraction;
//program to demonstrate abstraction
public abstract class Shape {
	protected float area;
    abstract void  calArea();//abstarct method
    void show()
    {
    System.out.println(" area of shape ="+area);
    }
}
