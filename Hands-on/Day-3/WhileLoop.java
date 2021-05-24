package com.corejava.basics;

import java.io.IOException;
import java.util.Scanner;

/*
 * while loop get executed until user enter the q 
 */
public class WhileLoop {

	public static void main(String[] args) throws IOException {

		char input;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("enter the character");
			input = (char) System.in.read();
			sc.nextLine();
			if (input == 'q')
				break;
			else
				continue;
		} while (true);
		sc.close();

	}

}
