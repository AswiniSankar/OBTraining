package com.corejava.basics.day5;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr = new int[10];// default value of array element is 0
		for (int i = 0; i < 10; i++)
			arr[i] = i;
		for (int i = 0; i < 10; i++)
			System.out.println("THE SAMPLE OF [" + i + "] is " + arr[i]);
	}

}
