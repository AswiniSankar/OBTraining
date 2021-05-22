package com.corejava.basics;


class Method1{            //vary number of parameters
	public void Display(int a, int b) {
		System.out.println(a+" "+b);
	}
	public void Display(int a) {
		System.out.println(a);
	}
	public void Display(int a, int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}
}
class Method2{         //vary the types of parameter
	public void Display(int a) {
		System.out.println(a);
	}
	public void Display(int a, double b) {
		System.out.println(a+" "+b);
	}
	public void Display(char a, int b) {
		System.out.println(a+" "+b);
	}
}
class Method3{              //order of parameters
	public void Display(char a, int b) {
		System.out.println(a+" "+b);
	}
	public void Display( int b,char a) {
		System.out.println(a+" "+b);
	}
}


public class MethodOverLoading1 {

	public static void main(String[] args) {
	
       Method1 obj1=  new Method1();
       obj1.Display(3);
       obj1.Display(3, 10);
       obj1.Display(10, 4, 19);
       
       Method2 obj2=  new Method2();
       obj2.Display(5);
       obj2.Display(4, 3.90);
       obj2.Display('r', 10);
       
       Method3 obj3=  new Method3();
       obj3.Display('f', 5);
       obj3.Display(10, 'u');

	}

}
