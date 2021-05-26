package com.corejava.basics.day5;

public class MinMaxOfArray {
	public static void main(String[] args) {
		int[] array = new int[5];
		int min,max;
		array[0]=12;
		array[1]=82;
		array[2]=-10;
		array[3]=354;
		array[4]=100;
		min=max=array[0];
		for(int i=1;i<=4;i++) {
			if(array[i]<min)min=array[i];
			if(array[i]>max)max=array[i];
		}
		System.out.println("The min and max of arraay are: "+ min + " "+ max);

	}

}
