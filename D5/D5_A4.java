package firstprj;

import java.util.Scanner;

public class D5_A4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number");
		int order = sc.nextInt();

		for (int i = 0; i < order; i++) {
			System.out.print(sum(i));
		}
	}

	public static int sum(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return sum(n - 2) + sum(n - 1);
		}
	}
}
