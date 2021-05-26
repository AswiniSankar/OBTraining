package com.corejava.assignments.day5;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		int row, col;

		System.out.println("Enter the row and column value for matrix [note : value should be less than 10]");
		Scanner s = new Scanner(System.in);
		row = s.nextInt();
		col = s.nextInt();

		if (row <= 10 && col <= 10) {
			System.out.println("enter the values for matrix 1");
			int matrix1[][] = new int[10][10];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					matrix1[i][j] = s.nextInt();
				}
			}

			System.out.println("enter the values for matrix 2");
			int matrix2[][] = new int[10][10];
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					matrix2[i][j] = s.nextInt();
				}
			}
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(matrix1[i][j] + matrix2[i][j] + "   ");
				}
				System.out.println();
			}

			s.close();
		} else {
			System.out.println("array out of index");
			System.exit(0);
		}

	}

}
