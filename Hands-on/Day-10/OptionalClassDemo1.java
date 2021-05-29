package com.corejava.basics.day10.java8features;

import java.util.Optional;

public class OptionalClassDemo1 {
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First Para is : " + a.isPresent());
		System.out.println("Secon Para is : " + b.isPresent());
		// orElse - value present it return otherwise return default value
		Integer firtsValue = a.orElse(new Integer(0));
		Integer secondValue = b.get();
		return firtsValue + secondValue;
	}

	public static void main(String[] args) {
		OptionalClassDemo1 opex = new OptionalClassDemo1();
		Integer value1 = new Integer(20);// if null given 0 get by orelse in sum method
		Integer value2 = new Integer(30);
		Optional<Integer> val1 = Optional.ofNullable(value1);// not allow null value but of- allow null value
		Optional<Integer> val2 = Optional.ofNullable(value2);
		System.out.println("Sum is : " + opex.sum(val1, val2));

	}

}
