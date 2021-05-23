package com.corejava.basics;

import java.util.Scanner;

public class GetInputUsingScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Emplyee Details ");
		String Name = sc.nextLine();
		char Gender = sc.next().charAt(0);
		int Age = sc.nextInt();
		long Mobile = sc.nextLong();
		double salary = sc.nextDouble();
		System.out.println(Name + "\n" + Gender + "\n" + Age + "\n" + Mobile + "\n" + salary);
		sc.close();

	}

}
