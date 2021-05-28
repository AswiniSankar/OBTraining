package com.corejava.assignments.day8.threads;


@SuppressWarnings("serial")
class NoNegativeException extends Exception {
	public NoNegativeException(String s) {
		super();
	}
}
@SuppressWarnings("serial")
class MinBalnceException extends Exception {
	public MinBalnceException(String s) {
		super();
	}
}
class BankingThread extends Thread{
	BankTranscation b;

	public BankingThread(BankTranscation p, int choice, int amount) {
		// TODO Auto-generated constructor stu
		b = p;
		if(choice ==1) {
			synchronized (p) {
				p.deposit(amount);
			} 
		}
		else {
			synchronized (p) {
				p.withdraw(amount);
			} 
		}
		
	}
}
class BankTranscation{
	int c_amount=1000;
	void deposit(int amount) {
		try {
			if (amount < 1) {
				throw new NoNegativeException("transcation declined due to negative amout");
			} else {
				System.out.println("Deposited amount :"+amount);
				this.c_amount+=amount;
				balance();
			}
		} catch (NoNegativeException e) {
			System.out.println("Transcation declined");
		}
	
	}
	void withdraw(int amount) {
		try {
			if (amount < 1) {
				throw new NoNegativeException("transcation declined due to negative amout");
			} else {
				try {

					this.c_amount -= amount;
					if (this.c_amount > 1000) {
						System.out.println("Withdraw amount :"+ amount);
						//this.c_amount-=amount;
						balance();

					} else {
						this.c_amount += amount;
						throw new MinBalnceException("declined");
					}
				} catch (MinBalnceException e) {
					System.out.println("sorry! currently unable to process your request");
				}
			}
		} catch (NoNegativeException e) {
			System.out.println("Transcation declined");
		}
		
	}
	void balance() {
		System.out.println("current balance is :"+this.c_amount);
	}
}
public class TranscationThread {

	public static void main(String[] args) {
		BankTranscation ref1 = new BankTranscation();
  BankingThread t1 = new BankingThread(ref1,1, 2000); //deposit
  BankingThread t2 = new BankingThread(ref1, 0, 1000); //withdraw
  t1.start();
  t2.start();
	}

}
