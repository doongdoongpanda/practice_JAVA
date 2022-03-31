package firstprj;

import java.util.Scanner;

public class D5_A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("input number1, number2");
		int cal1 = sc.nextInt();
		int cal2 = sc.nextInt();
		int cal3 = cal1 - cal2;

		System.out.println(sum(cal1) / sum(cal2) / sum(cal3));// 나누기 출력
	}

	public static int sum(int number) {
		if (number == 1) {
			return 1;
		} else {
			return number * sum(--number);
		}
	}

}