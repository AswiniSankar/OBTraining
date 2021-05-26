package com.corejava.assignments.day5;

import java.util.Arrays;

public class SortingArrayOfString {
	public static void main(String[] args) {
		String[] fruits = { "mango", "banana", "cherry", "apple", "orange", "pineapple", "custed apple" };
		Arrays.sort(fruits);// using array method
		System.out.println("sorting of array by  method1");
		System.out.print(Arrays.toString(fruits));

		for (int i = 0; i < fruits.length; i++) {
			for (int j = i + 1; j < fruits.length; j++) {
				if (fruits[i].compareTo(fruits[j]) > 0) { // using compare method
					String temp = fruits[i];
					fruits[i] = fruits[j];
					fruits[j] = temp;
				}
			}
		}
		System.out.println("\nsorting of array by  method2");
		for (String f : fruits) // for each loop
			System.out.print(f + " ");

	}

}
