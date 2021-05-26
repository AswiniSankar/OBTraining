package com.corejava.assignments.day5;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		int temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit for an array(Note should be less than 100)");
		int limit = s.nextInt();
		if (limit <= 100) {
			int[] array = new int[100];

			System.out.println("Enter the elements");
			for (int i = 0; i < limit; i++) {
				array[i] = s.nextInt();
			}
			System.out.println("original array Array....");
			for (int i = 0; i < limit; i++) {
				System.out.print(array[i] + " ");
			}
			for (int i = 0; i < limit / 2; i++) {
				temp = array[i];
				array[i] = array[limit - i - 1];
				array[limit - i - 1] = temp;
			}
			System.out.println("\nReversed Array by method1....");
			for (int i = 0; i < limit; i++) {
				System.out.print(array[i] + " ");
			}

		} else {
			System.out.println("Array out of index");
		}
		s.close();
	}

}
