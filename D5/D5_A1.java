package firstprj;

import java.util.Scanner;

public class D5_A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cal1 = sc.nextInt();
		int cal2 = sc.nextInt();

		System.out.println(sumToUpper(cal1) / sumToBottom(cal2));// 나누기 출력
	}

	public static int sumToUpper(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * sumToUpper(--number);
		}
	}

	public static int sumToBottom(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * sumToBottom(--number);
		}
	}
}
