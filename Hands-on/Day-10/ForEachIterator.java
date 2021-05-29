package com.corejava.basics.day10.java8features;

import java.util.Arrays;
import java.util.List;

public class ForEachIterator {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(2, 7, 90, 100, 34, 14);
		// java 1.8 feature
		values.forEach(iter -> System.out.println(iter));
		values.forEach(System.out::println); // it is not a println method and system.out.println acted as parameter
												// :: not a scope resolution operator
		values.stream().forEach(System.out::println); // 1.8 feature
		values.parallelStream().forEach(System.out::println); // 1.8 feature
	}

}
