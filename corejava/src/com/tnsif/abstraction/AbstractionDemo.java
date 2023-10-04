package com.tnsif.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle();
		Square s=new Square();
		 System.out.println(r);
		 System.out.println(s);
		 Shape sh;
		 //create a object through implementable method
         sh= new Rectangle(4.0f,2.0f);
         sh.calArea();
         sh.show();
         sh= new Square(4.0f);
         sh.calArea();
         sh.show();
         
         
	}

}
