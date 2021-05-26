package com.corejava.basics.day7.exceptionhandling;

import java.util.Scanner;

class GenerateTest {
	void generateExcdption(int a, int b) throws ArithmeticException {
		System.out.println("division of " + a + "and " + b + " is " + a / b);
	}
}

public class ThrowsDemo2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int number1, number2;
		System.out.println("enter number1");
		number1 = s.nextInt();
		System.out.println("enter number2");

		number2 = s.nextInt();
		GenerateTest obj = new GenerateTest();
		try {
			obj.generateExcdption(number1, number2);
		} catch (Exception e) {
			System.out.println("Division not possible");
		}
		s.close();
	}

}
