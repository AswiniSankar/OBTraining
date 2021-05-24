package com.corejava.assignments;

import java.util.Scanner;

public class SumOfOddNaturalNumbers {

	public static void main(String[] args) {
		int limit;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit");
		limit = sc.nextInt();
	    for (int i =1; i<=limit; i++) {
	    	if(i%2==1)
	    		sum+=i;
	    }
	    System.out.println("The sum of Odd Natural Numbers is: "+ sum);
	    sc.close();
	}

}
