package firstprj;

import java.util.Scanner;

public class p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int Number = scanner.nextInt();
		int divideNumber = scanner.nextInt();
		int total = 0;
		System.out.print("SUM : ");
		for (int i = 1; i <= Number; i++) {
			if (i % divideNumber == 0) {
				total += i;
			}
		}
		System.out.print(total + "(");
		for (int j = 1; j <= Number; j++) {
			if (j % divideNumber == 0) {
				if (j == Number) {
					System.out.println(j + ")");
				} else {
					System.out.print(j + ",");
				}

			}
		}
	}
}
