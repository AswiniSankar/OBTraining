package com.corejava.basics.day5;

public class StringArray {

	public static void main(String[] args) {

		String[] array = {"This","is","a","sample","program"};
		System.out.println("Before Modification");
		for(String s:array)
		System.out.print(s+" ");
		System.out.println("\n");
		array[1]="was";
		array[4]= array[4].concat(",too!");//string is immutable so reassign it 
		System.out.println("After Modification");
		for(String s:array)
			System.out.print(s+" ");
	}

}
