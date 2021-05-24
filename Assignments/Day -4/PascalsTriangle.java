package com.corejava.assignments;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		int limit;
		int value=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		limit = sc.nextInt();
	    for (int i =0; i<limit; i++) {
	     for(int j=1;j<=limit-i;j++)
	    	 System.out.print("  ");
	     for (int k= 0;k<=i;k++) {
	    	 if(k==0 || i==0)
	    		 value=1;
	    	 else
	    		 value= value *(i-k+1)/k;
	    	 System.out.print(value +"  ");
	      }
	      System.out.println();
	    }
	  
	    sc.close();
	}

}
