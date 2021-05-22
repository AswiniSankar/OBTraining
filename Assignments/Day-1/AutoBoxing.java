package com.corejava.basics;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number1= 50;
		 double number2= 25.25;
		 Integer Value1= number1;//boxing
		 Integer Value2 =Integer .valueOf(number1);//Autoboxing
		 Double Value3= number2;
		 Double Value4 = Double.valueOf(number2);
		 System.out.println(Value1+Value2);
		 System.out.println(Value3+Value4);

	}

}
