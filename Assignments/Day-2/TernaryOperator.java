package com.corejava.assignments;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int  age = sc.nextInt();
        int number = sc.nextInt();
        String result = age >= 18 ? "eligible for voting":"not eligible for voting";
        String res= number %2 ==1? "odd": "even";
        System.out.println(res);
       System.out.println(result);
         
	}

}
