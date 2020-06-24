package com.wipro.classandobjects;

public class Ex1 {
	public static void main(String[] args) {
		Box b=new Box(2,4,6);
		System.out.println("Volume is:" +b.volume());
	}
}
class Box{
	int width,heigth,depth;
	Box(int width,int heigth,int depth)
	{
		this.width=width;
		this.heigth=heigth;
		this.depth=depth;
	}
	int volume()
	{
		return this.width*this.heigth*this.depth;
	}
}