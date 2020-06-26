package com.wipro.overriding;

public class Ex2 {
	public static void main(String[] args) {
		Shape s=new Shape();
		s.draw();
		s.erase();
		Circle c=new Circle();
		c.draw();
		c.erase();
		Triangle t=new Triangle();
		t.draw();
		t.erase();
		Square sq=new Square();
		sq.draw();
		sq.erase();
	}
}
class Shape{
	void draw()
	{
		System.out.println("Drawing shape");
	}
	void erase()
	{
		System.out.println("Erasing shape");
	}
}
class Circle extends Shape{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase() {
		System.out.println("Erasing circle");
	}
}
class Triangle extends Shape{
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape{
	void draw()
	{
		System.out.println("Drawing Square");
	}
	void erase() {
		System.out.println("Erasing Square");
	}
}