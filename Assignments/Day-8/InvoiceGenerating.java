package com.corejava.assignments.day8.threads;

import java.util.Scanner;

public class InvoiceGenerating {

	public static void main(String[] args) {
		String[] items = { "Aloo Tikki", "Mango Chutney", "Momos", "Kulfi", "Masala Chai", "Samosas", "Chana Dal",
				"Chicken Jalfrezi", "Biryani", "Naan", "Palak Paneer", "Chicken Korma", "Pakora/Bhaji",
				"Butter Chicken", "chicken grill", "Aloo Gobi", "Tandoori Chicken", "Chicken Tikka Masala",
				"Lamb Rogan Josh", "Chicken Vindaloo" };
		int cost[] = { 30, 20, 40, 25, 10, 15, 40, 90, 150, 25, 50, 70, 10, 170, 400, 60, 250, 180, 60, 180 };
		int qty[] = new int[20];
		Scanner s = new Scanner(System.in);
		int ordered[] = new int[20];
		int t = 1, t1 = 1, k = 0;
		while (t == 1) {
			System.out.println("\nItem in the Restaurant are.....");
			System.out.println("s.no\t\tItems\t\t\tcost");
			for (int i = 0; i < 20; i++) {
				System.out.println(i + 1 + ".\t" + items[i] + "\t\t    " + cost[i]);
			}
			k = 0;
			int tamt = 0;
			t1 = 1;
			System.out.println("enter the correspoding item  and quantity to order food ");
			while (t1 == 1) {
				ordered[k] = s.nextInt();
				qty[k] = s.nextInt();
				tamt += cost[ordered[k] - 1] * qty[k];
				k++;
				System.out.println("enter 1 to continue order 0 to done");
				t1 = s.nextInt();
			}

			System.out.println("generating bill.....");
			System.out.println("s.no\t\tItems\t\t\tquatity\t\t\tcost");
			for (int i = 0; i < k; i++) {
				System.out.println(
						i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t" + cost[ordered[i] - 1]);
			}
			System.out.println("===============================================\ntotal amout is :" + tamt);
			System.out.println("Enter the mode of pay \n 1.cash 2.card 3.gpay/phonepay");
			t1 = s.nextInt();
			switch (t1) {

			case 1:
				System.out.println("give the bill amout");
				int amt = s.nextInt();
				if (amt == tamt) {
					System.out.println("here is the invoice.....");
					System.out.println("s.no\t\tItems\t\t\tquatity\t\t\tcost");
					for (int i = 0; i < k; i++) {
						System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
								+ cost[ordered[i] - 1]);
					}
					System.out.println("total amout is :" + tamt);
					System.out.println("//bill status is paid// ");
					System.out.println("amount collected\n");
					System.out.println("---------------------------------------------------------------");
					System.out.println("****Thank you for your visit come again ****");
				} else {
					System.out.println("you incorrectly given the amout");
					System.out.println("give the correct amonut");
					amt = s.nextInt();
					if (amt == tamt)
						System.out.println("here is the invoice.....");
					System.out.println("s.no\t\tItems\t\t\tquatity\t\t\tcost");
					for (int i = 0; i < k; i++) {
						System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
								+ cost[ordered[i] - 1]);
					}
					System.out.println("total amout is :" + tamt);
					System.out.println("//bill status is paid// ");
					System.out.println("amount collected\n");
					System.out.println("---------------------------------------------------------------");
					System.out.println("****Thank you for your visit come again ****");
				}
				break;
			case 2:
				System.out.println("enter your card pin");
				@SuppressWarnings("unused")
				int pin = s.nextInt();
				System.out.println("here is the invoice.....");
				System.out.println("s.no\t\tItems\t\t\tquatity\t\t\tcost");
				for (int i = 0; i < k; i++) {
					System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
							+ cost[ordered[i] - 1]);
				}
				System.out.println("total amout is :" + tamt);
				System.out.println("//bill status is paid// ");
				System.out.println("amount collected\n");
				System.out.println("---------------------------------------------------------------");
				System.out.println("****Thank you for your visit come again ****");
				break;
			case 3:
				System.out.println("scan here");
				System.out.println("here is the invoice.....");
				System.out.println("s.no\t\tItems\t\t\tquatity\t\t\tcost");
				for (int i = 0; i < k; i++) {
					System.out.println(i + 1 + ".\t" + items[ordered[i] - 1] + "\t\t\t" + qty[i] + "\t\t\t"
							+ cost[ordered[i] - 1]);
				}
				System.out.println("total amout is :" + tamt);
				System.out.println("//bill status is paid// ");
				System.out.println("amount collected\n");
				System.out.println("---------------------------------------------------------------");
				System.out.println("****Thank you for your visit come again ****");
				break;
			default:
				System.out.println("invalid choice");
				break;

			}
			System.out.println("enter 1 you are a customer going to eat  or 0 to exit");
			t = s.nextInt();
		}
		s.close();
	}
}
