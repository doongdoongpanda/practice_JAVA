package firstprj;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0;
		System.out.println("#Menu\n1.Deposit\n2.Withdrawal\nBalance : " + balance + "\n->");
		while (true) {
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			int money = scanner.nextInt();
			if (choice == 1) {
				balance += money;
			} else if (choice == 2) {
				balance -= money;

			}

			System.out.println("#Menu\n1.Deposit\n2.Withdrawal\nBalance : " + balance + "\n->");
		}
	}
}
