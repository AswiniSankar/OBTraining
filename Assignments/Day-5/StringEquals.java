package com.corejava.assignments.day5;

public class StringEquals {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = s1;
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s1));
		String s3 = "Java";
		System.out.println(s1.equalsIgnoreCase(s3));
	}

}
