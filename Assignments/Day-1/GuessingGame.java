package com.corejava.assignments;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		char TO_FIND='K';
		char input ;
		//System.out.println((int)TO_FIND - (int)g);
		while(true) {
		  @SuppressWarnings("resource")
		Scanner S= new Scanner(System.in);
		  input = S.next().charAt(0);
		  if (input==TO_FIND || input== (TO_FIND)+32) {
			  System.out.println("KUDOOS!!....You Won it");
			  System.exit(0);
		  }
		  System.out.println("OOPS!!....try againr");
		}
	}

}
