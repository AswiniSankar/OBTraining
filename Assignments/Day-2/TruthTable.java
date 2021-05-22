package com.corejava.assignments;

public class TruthTable {

	public static void main(String[] args) {
		System.out.println("=========================================");

		//System.out.println("|----------------------------------------");
		System.out.println("|P"+"\t|"+" Q"+"\t|"+" P&Q"+"\t|"+" P|Q"+"\t|"+" P^Q\t|");
		//System.out.println("----------------------------------------");
		System.out.println("=========================================");

		for(int i=1;i<=2;i++) {
			for(int j=1;j<=2;j++)
			System.out.println("|"+(i%2!=0)+"\t|"+(j%2!=0)+"\t|"+
			        ((i%2!=0)&&(j%2!=0))+"\t|"+
					((i%2!=0)||(j%2!=0))+"\t|"+
			        ((i%2!=0)^(j%2!=0))+"\t|");
		}
		//System.out.println("-----------------------------------------");
		System.out.println("=========================================");


	}

}
