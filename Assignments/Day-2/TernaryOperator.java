package com.corejava.assignments;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		String result = age >= 18 ? "eligible for voting" : "not eligible for voting";
		System.out.println("You are " + result);
		sc.close();

	}

}
