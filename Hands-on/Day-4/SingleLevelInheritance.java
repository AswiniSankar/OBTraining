package com.corejava.basics;

class TwoDShape {
	double width;
	double height;

	void dimensions() {
		System.out.println("Dimensions are :" + width + " " + height);
	}
}

class Triangle1 extends TwoDShape {
	String style;

	void showStyle() {
		System.out.println("style is " + style);
	}

	void area() {
		System.out.println("area is " + (width * height) / 2);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		System.out.println("Properties Traingle one");
		Triangle1 triangle1 = new Triangle1();
		triangle1.height = 12;
		triangle1.width = 6;
		triangle1.style = "with border";
		triangle1.dimensions();
		triangle1.area();
		triangle1.showStyle();

		System.out.println("Properties Traingle two");

		Triangle1 triangle2 = new Triangle1();
		triangle2.height = 10;
		triangle2.width = 20;
		triangle2.style = "without border";
		triangle2.dimensions();
		triangle2.area();
		triangle2.showStyle();

	}

}
