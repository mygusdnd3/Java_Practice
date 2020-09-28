package my_practice;

import java.util.*;

public class rtemp {

	public static void main(String[] args) {

//		RunnableEx r = new RunnableEx();
//	    Thread t1 = new Thread(r);
//	    Thread t2 = new Thread(r);
//	    t1.start();
//	    t2.start();
		Thread r1 = new Thread(new MyRunnable("A"));
		Thread r2 = new Thread(new MyRunnable("B"));
		r1.start();
		r2.start();

	}
}

class Account {
	private int balance = 1000;

	public int getBalance() {
		return balance;
	}

	public synchronized void withdraw(int money) {
		if (balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
			} catch (Exception e) {
			}
		} else if (balance == 0) {
			System.out.println("0일때 접근됨");
		}
	}
}

class RunnableEx implements Runnable {
	Account acc = new Account();

	@Override
	public void run() {
		while (acc.getBalance() > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			System.out.println(money);
			acc.withdraw(money);
			System.out.println("Balance: " + acc.getBalance());
		}
	}

}

class MyRunnable implements Runnable {

	String myName;

	public MyRunnable(String name) {
		this.myName = name;
	}

	@Override
	public synchronized void run() {
		 
			for (int i = 10; i >= 0; i--) {
				// Thread.sleep(1000);
				System.out.println(myName + i + "  ");
			}

		}
	
}
