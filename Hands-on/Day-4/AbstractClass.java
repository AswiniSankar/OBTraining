package com.corejava.basics;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a rectangle");

	}

}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("Draw a triangle");

	}

}

public class AbstractClass {

	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		s1.draw();
		Shape s2 = new Triangle();
		s2.draw();
	}

}
