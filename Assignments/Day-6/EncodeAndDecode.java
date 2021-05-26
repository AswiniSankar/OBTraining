package com.corejava.assignments.day5;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EncodeAndDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		char[] array1 = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };
		Scanner s = new Scanner(System.in);
		System.out.println("enter the input string,....");
		String input = s.nextLine();
		char[] s1 = input.toCharArray();
		int[] number = new int[input.length()];
		System.out.println("Encoded String by method1");
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				if (array1[j] == s1[i]) {
					number[i] = j;
					System.out.print(j + "");
				} else if (s1[i] == ' ') {
					number[i] = 99;
					System.out.print(99 + "");
					break;
				}
			}

		}
		byte[] array = input.getBytes("UTF8");
		System.out.println("\nEncoded String by method2");
		for (byte k : array) {
			if (k == 32)
				System.out.print(99 + "");
			else
				System.out.print(k - 97 + "");
		}
		System.out.println("\ndecoded String by method1");
		for (int i : number) {
			if (i == 99)
				System.out.print(" " + "");
			else
				System.out.print(array1[i]);
		}

		s.close();
	}

}