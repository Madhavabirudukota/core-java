package com.tnsif.overload;

public class FunctionOverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionOverload ob=new FunctionOverload();
		int s=ob.volume(4);
		System.out.println("Volume of the cube="+s);
		float t=ob.volume(2.0f,3.0f,4.0f);
		System.out.println("Volume of cubiod="+t);
		double u=ob.volume(2.0d);
		System.out.println("Volume of cubiod="+u);
		
	}

}
