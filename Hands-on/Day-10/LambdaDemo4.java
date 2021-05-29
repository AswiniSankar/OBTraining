package com.corejava.basics.day10.java8features;

import java.sql.Date;
import java.time.LocalDate;

interface DateInterface {
	int process(); //Abstract method - SAM
	static Date nowate() { //normal method
		return new Date(0);
	}
	default LocalDate formatDate() {  //normal method
		return LocalDate.now();
	}
	default int calculate(int a , int b) {  //normal method
		return a+b;
	}
}
public class LambdaDemo4 {

	public static void main(String[] args) {
		DateInterface ref = () -> 100; //for return type 
		System.out.println(ref.process());
		System.out.println(ref.calculate(12, 8));
		System.out.println(ref.formatDate());

	}

}
