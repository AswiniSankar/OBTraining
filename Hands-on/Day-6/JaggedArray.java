package com.corejava.basics.day5;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
     int sample[][]= new int[3][];
     sample[0]= new int[] {1,2,3};
     sample[1]= new int[] {4,5};
     sample[2]= new int[] {6,7,8,9};
     for(int i=0;i<sample.length;i++) {
    	 System.out.println(Arrays.toString(sample[i]));
     }
     
     for(int[] val:sample) {
    	 System.out.println(Arrays.toString(val));
     }
	}

}
