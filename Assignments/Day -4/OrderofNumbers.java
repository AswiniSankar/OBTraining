package com.corejava.assignments;

import java.util.Scanner;

public class OrderofNumbers {

	public static void main(String[] args) {
		int number1;
		int number2;
		int number3;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three numbers");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		number3 = sc.nextInt();
		if ((number1 < number2) && (number2 < number3)) {
			System.out.println("The entered numbers are in increasing order");
		} else if ((number1 > number2) && (number2 > number3)) {
			System.out.println("The entered numbers are in decreasing order");

		} else {
			System.out.println("The entered numbers are neither increasing nor decreasing order");

		}
		sc.close();
	}

}
