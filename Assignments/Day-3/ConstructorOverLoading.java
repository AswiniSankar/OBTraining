package com.corejava.assignments;

import java.util.Scanner;

class Box {
	double width;
	double height;
	double lenght;

	public Box() {

		this.width = 1;
		this.height = 1;
		this.lenght = 1;
	}

	public Box(double height) {

		this();
		this.height = height;
	}

	public Box(double width, double lenght) {
		this();
		this.width = width;
		this.height = lenght;

	}

	public Box(double width, double height, double lenght) {

		this.width = width;
		this.height = height;
		this.lenght = lenght;

	}

	public void volume() {

		System.out.println(width * height * lenght);

	}

}

public class ConstructorOverLoading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double lenght = sc.nextDouble();
		double height = sc.nextDouble();
		Box o1 = new Box();
		Box o2 = new Box(height);
		Box o3 = new Box(width, lenght);
		Box o4 = new Box(width, height, lenght);
		o1.volume();
		o2.volume();
		o3.volume();
		o4.volume();
		sc.close();
	}

}
