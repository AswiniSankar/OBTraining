package com.corejava.assignments.day7.exceptionalhandling;

import java.util.Scanner;


@SuppressWarnings("serial")
class MinBalnceException extends Exception {
	public MinBalnceException(String s) {
		super();
	}
}

@SuppressWarnings("serial")
class NoNegativeException extends Exception {
	public NoNegativeException(String s) {
		super();
	}
}

public class BankTranscation {

	public static void main(String[] args) {
		String name;
		long acc_no = 4131801033133119l;

		long mobile_no;
		int balance = 1000;
		int amt, temp = 1, k = 0;
		String history[] = new String[20];
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name of customer");
		name = s.nextLine();
		System.out.println("enter mobile number");
		mobile_no = s.nextLong();
		while (temp == 1) {
			System.out.println("\n1.credit 2.debit 3.transcation 4.current balance 5.exit");
			System.out.println("enter the choice");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the amount to cr");
				amt = s.nextInt();
				try {
					if (amt < 1) {
						throw new NoNegativeException("transcation declined due to negative amout");
					} else {
						balance += amt;
						history[k++] = "+" + balance;
					}
				} catch (NoNegativeException e) {
					System.out.println("Transcation declined");
				}
				break;
			case 2:
				System.out.println("enter the amt to dr");
				amt = s.nextInt();
				try {
					if (amt < 1) {
						throw new NoNegativeException("transcation declined due to negative amout");
					} else {
						try {

							balance -= amt;
							if (balance > 1000) {
								System.out.println("amt debited and current balance is :" + balance);
								history[k++] = "-" + balance;

							} else {
								balance += amt;
								throw new MinBalnceException("declined");
							}
						} catch (MinBalnceException e) {
							System.out.println("sorry! currently unable to process your request");
						}
					}
				} catch (NoNegativeException e) {
					System.out.println("Transcation declined");
				}
				break;
			case 3:

				if (history.length == 0) {
					System.out.println("currently no transaction occurs");

				} else {
					System.out.println("Name :" + name + "                       acc_no :" + acc_no + "\nMobile number"
							+ mobile_no + "              current balance" + balance);

					System.out.println("your trancations are");
					for (int i = 0; i < k; i++) {
						System.out.print(history[i] + "  ");
					}
				}
				break;
			case 4:
				System.out.println("current balance is: " + balance);
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("invalid input");
				break;
			}

		}
		s.close();
	}

}
