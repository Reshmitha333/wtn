package com.wipro.overriding;

public class Ex1 {
	public static void main(String[] args) {
		Apple a=new Apple();
		a.eat();
		Orange o=new Orange();
		o.eat();
	}
}
class Fruit
{
	String name,taste;
	int size;
	void eat()
	{
		System.out.println("Basic");
	}
	
}
class Apple extends Fruit{
	String name="Apple";
	String taste="sweet";
	void eat()
	{
		System.out.println(name + " tastes "+taste);
	}
}
class Orange extends Fruit
{
	String name="Orange";
	String taste="sour";
	void eat()
	{
		System.out.println(name +" tastes "+taste);
	}
}
