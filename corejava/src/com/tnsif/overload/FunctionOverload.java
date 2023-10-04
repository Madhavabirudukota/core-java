package com.tnsif.overload;

public class FunctionOverload {
public int volume(int f)
{
return(f*f*f);	
}
public float volume(float l,float b,float h)
{
return(l*b*h);
}
public double volume(double r)
{
	return(4/3*3.14*r*r*r);
}
}