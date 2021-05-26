package com.corejava.basics.day5;

public class StringDemo {

	public static void main(String[] args) {

		String s1="JAVA";
		byte[] s2= {'S','t','r','i','n','g'};
		String s3 = new String(s2);//it can be any type of char array 
		String s4 = new String("technovate");//direct input
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s4);
	}

}
