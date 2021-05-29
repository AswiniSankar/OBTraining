package com.corejava.assignments.day9.collections;

import java.util.Collections;
import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<Employee> ve = new Vector<>();
		ve.add(new Employee(23, "Raja"));
		ve.add(new Employee(6, "Deepika"));
		ve.add(new Employee(78, "Menaga"));
		System.out.println("-----Using For Each Loop------");
		for(Employee e : ve) {
			System.out.println(e);
		}
		Collections.sort(ve);
		System.out.println("-----sorted vector--------");
		for(Employee e : ve) {
			System.out.println(e);
		}
		
	}

}
