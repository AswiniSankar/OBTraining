package com.corejava.assignments.day5;

import java.util.Scanner;

public class SortingArrayForInteger {

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
			System.out.println("original array Array....");
			for (int i = 0; i < limit; i++) {
				System.out.print(array[i] + " ");
			}
			int temp;
			for (int i = 0; i < limit; i++) {
				for (int j = i + 1; j < limit; j++) {
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			System.out.println("\nSorted array....");
			for (int i = 0; i < limit; i++) {
				System.out.print(array[i] + " ");
			}
		} else {
			System.out.println("Array out of index");
		}
		s.close();

	}

}
