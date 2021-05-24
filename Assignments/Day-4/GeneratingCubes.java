package com.corejava.assignments;

import java.util.Scanner;

public class GeneratingCubes {

	public static void main(String[] args) {
		int limit;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		limit = sc.nextInt();
	    for (int i =1; i<=limit; i++) {
	    	System.out.println(i*i*i);
	    }
   sc.close();
	}

}
