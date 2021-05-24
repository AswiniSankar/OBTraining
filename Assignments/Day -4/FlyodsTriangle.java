package com.corejava.assignments;

import java.util.Scanner;

public class FlyodsTriangle {

	public static void main(String[] args) {
		int limit;
		int sum=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		limit = sc.nextInt();
	    for (int i =1; i<=limit; i++) {
	      for (int j=1;j<=i;j++) {
	    	 	    		  System.out.print(sum++ +" ");
	    	 
	      }
	      System.out.println();
	    }
	  
	    sc.close();
	}

}
