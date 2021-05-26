package com.corejava.assignments.day5;

public class StringIsImmutable {

	public static void main(String[] args) {
		String s1 = "Java Is a ";
		s1.concat("programing language");// s1 is changed but in different location
		System.out.println(s1);
		s1 = s1.concat("Programing language");// the updated string is again assigned with the string
		System.out.println(s1);

	}

}
