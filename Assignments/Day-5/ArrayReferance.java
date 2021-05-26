package com.corejava.assignments.day5;

public class ArrayReferance {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = array1;
		array2[3] = 99; // 4 is replaced with 99
		for (int a : array2) {
			System.out.println(a);
		}

	}

}
