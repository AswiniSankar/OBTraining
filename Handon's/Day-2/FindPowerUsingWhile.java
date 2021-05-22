package com.corejava.basics;
public class FindPowerUsingWhile {

	public static void main(String[] args) {
	  
		int i=3,result=1,base=-3;
		while(i!=0) {
			result*=base;
			i--;
		}
			System.out.println(result);
        	
	}

}
