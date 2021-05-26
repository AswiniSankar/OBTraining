package com.corejava.assignments.day5;

import java.util.Scanner;

public class CheckForElemnt {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit for an array(Note should be less than 100)");
		int limit = s.nextInt();
		if (limit <= 100) {
			int[] array = new int[100];

			System.out.println("Enter the elements");
			for (int i = 0; i < limit; i++) {
				array[i] = s.nextInt();
			}
			int element, flag = 0;
			System.out.println("enter the element thet your want to search");
			element = s.nextInt();
			for (int i = 0; i < limit; i++) {
				if (array[i] == element) {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("element present....");
			} else
				System.out.println("element is not present....");

		} else {
			System.out.println("Array out of index");
		}
		s.close();
	}

}
