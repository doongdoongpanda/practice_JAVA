package firstprj;

import java.util.Scanner;

public class D5_A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input a number");
		int MulNumber = sc.nextInt();

		for (int i = 1; i < 9; i++) {
			System.out.println(MulNumber + "X" + turning(i) + " = " + MulNumber * turning(i));
		}
	}

	public static int turning(int number) {
		if (number == 1) {
			return 2;
		} else {
			return number + 1;
		}
	}
}
