package com.corejava.basics.day5;

public class ForEachLoop {

	public static void main(String[] args) {
       int array[]= {1,2,3,4,5,6,7,8,9,10};
       int sum=0;
       for(int i=0;i<10;i++) {
    	   sum+=array[i];
       }
       System.out.println("Normal for loop "+sum);
       sum=0;
       for(int iter: array) {
    	   sum+=iter;
       }
       System.out.println("for each loop "+sum);
       System.out.println("average of elements: "+ (sum)/array.length);
	}

}
