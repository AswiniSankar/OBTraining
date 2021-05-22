package com.corejava.assignments;

import java.util.Scanner;

class Box{
	double Width;
	double Height;
	double Lenght;
	
	public Box() {
		
		this.Width = 1;
		this.Height = 1;
		this.Lenght = 1;
	}
	public Box(double height) {
		
		this();
		this.Height = height;
	}
	
	public Box(double width, double lenght) {
		this();
		this.Width = width;
		this.Height = lenght;
		
	}

	public Box(double width, double height, double lenght) {
	
		this.Width = width;
		this.Height = height;
		this.Lenght = lenght;
		
	}
	public void Volume() {
	
		System.out.println(Width*Height*Lenght);
	
	}
	
	
	
}

public class BoxClass {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		double width = sc.nextDouble();
		double lenght = sc.nextDouble();
		double height = sc.nextDouble();
		Box o1 = new Box();
		Box o2 = new Box(height);
		Box o3 = new Box(width, lenght);
		Box o4 = new Box(width, height, lenght);
		o1.Volume();
		o2.Volume();
		o3.Volume();
		o4.Volume();
        sc.close();
	}

}
