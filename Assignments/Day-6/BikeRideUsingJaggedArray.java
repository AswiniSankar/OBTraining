package com.corejava.assignments.day6;

import java.util.Scanner;

public class BikeRideUsingJaggedArray {

	public static void main(String[] args) {
		int[][] weekdays = new int[5][20];
		int[][] weekends = new int[2][20];
		int loop = 1;
		int temp;
		int choice, choice1;
		int k1 = 0, k2 = 0, k3 = 0, k4 = 0, k5 = 0, k6 = 0, k7 = 0;
		Scanner s = new Scanner(System.in);
		while (loop == 1) {
			System.out.println("Are you a bike rider 1 for yes and 0 for no");
			temp = s.nextInt();
			if (temp == 1) {
				System.out.println("1.weekdays 2.weekends 3.display");
				System.out.println("enter the choice");
				choice = s.nextInt();
				switch (choice) {
				case 1:
					System.out.println("1.monday 2. tuesday 3. wednesday 4.thursday 5.friday 6.saturday 7.sunday");
					System.out.println("enter the choice");
					choice1 = s.nextInt();
					switch (choice1) {

					case 1:
						System.out.println("enter the km's");
						weekdays[0][k1] = s.nextInt();
						k1++;
						break;
					case 2:
						System.out.println("enter the km's");
						weekdays[1][k2] = s.nextInt();
						k2++;
						break;
					case 3:
						System.out.println("enter the km's");
						weekdays[2][k3] = s.nextInt();
						k3++;
						break;
					case 4:
						System.out.println("enter the km's");
						weekdays[3][k4] = s.nextInt();
						k4++;
						break;
					case 5:
						System.out.println("enter the km's");
						weekdays[4][k5] = s.nextInt();
						k5++;
						break;
					default:
						System.out.println("invalid option");
						break;
					}

					break;
				case 2:
					System.out.println("1.saturday 2.sunday ");
					System.out.println("enter the choice");

					choice1 = s.nextInt();
					switch (choice1) {

					case 1:
						System.out.println("enter the km's");
						weekends[0][k6] = s.nextInt();
						k6++;
						break;
					case 2:
						System.out.println("enter the km's");
						weekends[1][k7] = s.nextInt();
						k7++;
						break;
					default:
						System.out.println("invalid input");
						break;
					}
					break;
				case 3:
					int total_km = 0;
					System.out.println("1.monday 2. tuesday 3. wednesday 4.thursday 5.friday 6.saturday 7.sunday");
					System.out.println("enter the choice");
					choice = s.nextInt();
					switch (choice) {
					case 1:
						for (int i = 0; i < k1; i++) {
							System.out.print(weekdays[0][i] + " ");
							total_km += weekdays[0][i];
						}
						System.out.println("Total Km's that rider covered in monday " + total_km + "\n");

						break;
					case 2:
						for (int i = 0; i < k2; i++) {
							System.out.print(weekdays[0][i] + " ");
							total_km += weekdays[0][i];

						}
						System.out.println("Total Km's that rider covered in tuesday " + total_km + "\n");

						break;
					case 3:
						for (int i = 0; i < k3; i++) {
							System.out.print(weekdays[0][i] + " ");
							total_km += weekdays[0][i];

						}
						System.out.println("Total Km's that rider covered in wednesday " + total_km + "\n");

						break;
					case 4:
						for (int i = 0; i < k4; i++) {
							System.out.print(weekdays[0][i] + " ");
							total_km += weekdays[0][i];

						}
						System.out.println("Total Km's that rider covered in thursday " + total_km + "\n");

						break;
					case 5:
						for (int i = 0; i < k5; i++) {
							System.out.print(weekdays[0][i] + " ");
							total_km += weekdays[0][i];

						}
						System.out.println("Total Km's that rider covered in friday " + total_km + "\n");

						break;
					case 6:
						for (int i = 0; i < k6; i++) {
							System.out.print(weekends[0][i] + " ");
							total_km += weekends[0][i];

						}
						System.out.println("Total Km's that rider covered in saturday " + total_km + "\n");

						break;
					case 7:
						for (int i = 0; i < k7; i++) {
							System.out.print(weekends[1][i] + " ");
							total_km += weekends[1][i];

						}
						System.out.println("Total Km's that rider covered in sunday " + total_km + "\n");

						break;
					default:
						System.out.println("invalid option");
						break;
					}

					break;

				default:
					System.out.println("invalid input");
					break;
				}

			} else {
				System.out.println("sorry!! only rider can enter");
			}
			System.out.println("will you continue 1-for yes and 0 for no");
			loop = s.nextInt();
		}
		s.close();
	}

}
