package firstprj;

import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, total = 0, max = 0, min = 0;

		while (true) {
			System.out.println("Enter number");
			int inputNumber = scanner.nextInt();
			count ++;
			total += inputNumber;
			if (count == 1) {
				max = inputNumber;
				min = inputNumber;
			} else {
				if (inputNumber > max) {
					max = inputNumber;
				}
			if (min > inputNumber) {
				min = inputNumber;
				}
			}
			System.out.print("Result - " + count + " ");
			System.out.print(" Mean: " + total/count + " ");
			System.out.print(" Max:  " + max + " ");
			System.out.println(" Min: " + min + " ");

		}
	}
}
