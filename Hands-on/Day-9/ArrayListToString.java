package com.corejava.basics.day9.collections;

import java.util.ArrayList;

//converting array list of string to string
public class ArrayListToString {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Welcome");
		arrayList.add("to");
		arrayList.add("TechnoElevate");
		String[] stringarray = new String[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) { // also use stringarray.lenght
			stringarray[i] = arrayList.get(i);
		}
		for (String s : stringarray) {
			System.out.println(s);
		}

	}

}
