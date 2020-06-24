package com.wipro.classandobjects;

public class Ex2 {
	public static void main(String[] args) {
		Power p=new Power();
		System.out.println("powerInt:"+p.powerInt(2, 3));
		System.out.println("powerDouble:"+p.powerDouble(2.1, 3.1));
	}
}
class Power{
	double powerInt(int a,int b)
	{
		return Math.pow(a,b);
	}
	double powerDouble(double a,double b)
	{
		return Math.pow(a, b);
	}
}