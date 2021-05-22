package com.corejava.assignments;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.*;

public class SquareRootOfQuadraticEquation {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings({ "resource" })
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double determinant = (b * b) - (4 * a * c);
		double squareroot = sqrt(determinant);
		if (determinant > 0) {
			double firstroot = (-b + squareroot) / (2 * a);
			double secondroot = (-b - squareroot) / (2 * a);
			System.out.println("Roots are:" + firstroot + " " + secondroot);

		} else if (determinant == 0) {
			System.out.println("Root is:" + (-b + squareroot) / (2 * a));
		}
		
	}

}
