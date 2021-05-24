package com.corejava.basics;

class Person {
	String name;
	String address;

	public Person() {

		this.name = "name";
		this.address = "address";
	}

	public Person(String name) {
		this();
		this.name = name;

	}

	public Person(String name, String address) {

		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", address=" + address + "]";
	}

}

public class ConstructorOverloading {

	public static void main(String[] args) {

		Person o1 = new Person();
		Person o2 = new Person("kumar");
		Person o3 = new Person("meena", "INDIA");

		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(o3.toString());

	}

}
