package com.corejava.assignments.day5;

public class SquareOfNumberIn2DArray {

	public static void main(String[] args) {
   int square[][] = new int [10][2];
   int t=1;
   for(int i=0;i<10;i++) {
	  
		   square[i][0]=t; 
		   square[i][1]=t*t;
		   t++;
   }
  
		for(int i=0;i<10;i++) {
		
			System.out.println(square[i][0]+"      "+ square[i][1]);
			
		}
	}

}
