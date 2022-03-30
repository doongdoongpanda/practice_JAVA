package firstprj;

import java.util.Scanner;

public class additional_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // object creation for scnnaer
		int Number = scanner.nextInt(); // user inputs a number
		int divideNumber1 = scanner.nextInt(); // divider #1
		int divideNumber2 = scanner.nextInt(); // divider #2

		int divide1 = Number % divideNumber1; // remainder #1
		int divide2 = Number % divideNumber2; // remainder #2
		if (divide1 == 0 && divide2 == 0) {
			System.out.println("Divisible by " + divideNumber1 + " and " + divideNumber2);
		} else {
			System.out.println("NOT divisible by " + divideNumber1 + " and " + divideNumber2);
		}
	}
}
