package com.corejava.assignments;

import java.util.Scanner;


public class PyramidPattern {

	public static void main(String[] args) {
	int limit;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the limit");
	limit = sc.nextInt();
    for (int i =1; i<=limit; i++) {
      for(int j=i;j<limit;j++) {
    	  System.out.print(" ");
      }
      for(int k=1 ;k<=i;k++)
    	  System.out.print(i+" ");
    
 	System.out.println();
    }
    sc.close();
	}

}
