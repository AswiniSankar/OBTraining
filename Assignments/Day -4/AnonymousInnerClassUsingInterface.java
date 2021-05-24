package com.corejava.assignments;
interface Eatable{
	void eat();
}
public class AnonymousInnerClassUsingInterface {

	public static void main(String[] args) {
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
          System.out.println("fruits are delecious:)...");				
			}
		};
		e.eat();
	}

}
