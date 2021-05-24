package com.corejava.assignments;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		char TO_FIND = 'K';
		char input;
		while (true) {
			Scanner sc = new Scanner(System.in);
			input = sc.next().charAt(0);
			if (input == TO_FIND || input == (TO_FIND) + 32) {
				System.out.println("KUDOOS!!....You Won it");
				System.exit(0);
			}
			System.out.println("OOPS!!....try againr");
			sc.close();
		}
	}

}
