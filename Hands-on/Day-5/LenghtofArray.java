package com.corejava.basics.day5;

public class LenghtofArray {

	public static void main(String[] args) {
		int[] sample1 = new int[10];
		sample1[0] = 2;
		sample1[1] = 4;
		int[] sample2 = { 1, 2, 3 };
		int[][] sample3 = { { 1, 2 }, { 1, 2, 3 }, { 1, 2, 3, 4 }, { 4, 2 } };
		System.out.println(sample1.length);
		System.out.println(sample2.length);
		System.out.println(sample3.length);
		System.out.println(sample3[0].length);
		System.out.println(sample3[1].length);
		System.out.println(sample3[2].length);

		for (int i = 0; i < sample1.length; i++)// lenght is a data member of array class
			System.out.println(sample1[i]); // lenght doesn't affect the size based upon elements
	}

}
