package com.corejava.basics.day7.exceptionhandling;

class GenerateExceptions {
	public static void generateexceptions(int val) {
		int[] num = new int[2];
		try {
			switch (val) {
			case 0:
				int ans = val / 0;
				System.out.println("the diveded value is" + ans);
				break;
			case 1:
				num[3] = 30;
				break;
			case 2:
				System.out.println("no exception ");
				break;
			default:
				break;
			}
		} catch (ArithmeticException e) {
			System.out.println("can't divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("array over running");
		} finally {
			System.out.println("100% executed");
		}
	}
}

public class FinallyDemo2 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			GenerateExceptions.generateexceptions(i);
		}
	}

}
