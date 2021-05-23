package com.corejava.basics;

import java.io.IOException;
import java.util.Scanner;

public class MultipleLoops {

	public static void main(String[] args) throws IOException {
		int i, j;
		Scanner sc = new Scanner(System.in);
		for (i = 0, j = 10; i < j; i++, j--)
			System.out.println(i + " " + j);
		sc.close();
	}

}
