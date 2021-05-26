package com.corejava.assignments.day5;

public class MinAndMaxOfArray {

	public static void main(String[] args) {
		int[] array = new int[5];
		int min, max;
		array[0] = 12;
		array[1] = 82;
		array[2] = -10;
		array[3] = 354;
		array[4] = 100;
		min = max = array[0];
		int secondmax = array[0];
		int secondmin = array[0];
		for (int i = 1; i <= 4; i++) {

			if (array[i] > max) {
				secondmax = max;
				max = array[i];
			} else if (array[i] > secondmax) {
				secondmax = array[i];
			}

			if (array[i] < min) {
				secondmin = min;
				min = array[i];
			} else if (array[i] < secondmin) {
				secondmin = array[i];
			}
		}
		System.out.println("The second min and max of arraay are: "+ secondmax + " " + secondmin);
	}

}
