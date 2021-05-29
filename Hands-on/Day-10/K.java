package com.corejava.basics.day10.java8features;

public class K extends A implements J, I {

	public static void main(String[] args) {
		K k = new K();
		k.show();
		// class given more priority over interface
		// third- rule in java
		// priority -> interface ->superclass ->childclass
	}

	public void show() {

		System.out.println(" show()  inside a  calss K");
	}
}
