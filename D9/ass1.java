package D9_main;

import java.util.ArrayList;
import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = scanNum();
		calculate(number);
	}

	public static int scanNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number");
		int number = sc.nextInt();
		return number;
	}

	public static void calculate(int number) {
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int i = 0; i < number; i++) {
			if (i == 0) {
				numList.add(0);
			} else if (i == 1) {
				numList.add(1);
			} else {
				int sum = numList.get(i - 2) + numList.get(i - 1);
				numList.add(sum);
			}
		}

		for (int j = 0; j < number; j++) {
			System.out.print(numList.get(j) + " ");
		}
	}
}