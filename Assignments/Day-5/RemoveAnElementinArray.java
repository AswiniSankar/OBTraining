package com.corejava.assignments.day5;

import java.util.Scanner;

public class RemoveAnElementinArray {

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
			System.out.println("enter the position to delete  (note: it should be from 0 to " + (limit - 1) + ")");

			int position = s.nextInt();
			if (position <= limit) {

				for (int i = position; i < limit; i++) {

					array[i] = array[i + 1];

				}

				limit--;
				for (int i = 0; i < limit; i++) {
					System.out.println(array[i]);
				}

			} else {
				System.out.println("position out of index");
			}
		} else {
			System.out.println("Array out of index");
		}
		s.close();
	}

}
