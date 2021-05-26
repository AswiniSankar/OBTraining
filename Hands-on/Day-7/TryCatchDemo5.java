package com.corejava.basics.day7.exceptionhandling;

public class TryCatchDemo5 {

	public static void main(String[] args) {
		int numer[] = { 8, 4, 16, 20, 32, 124, 80, 66, 12 };
		int denom[] = { 4, 0, 2, 0, 8 };
		try {
		for (int i = 0; i < numer.length; i++) {
			try {
				System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i] / denom[i]);
			} 
			catch (ArithmeticException e) {

				System.out.println("can't divide a numerator with zero");
			}
		}
	    }
			catch (Exception e) {
				System.out.println("General Exception....");
				System.out.println("code terminated..");
			}
		

	}

}
