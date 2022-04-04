package pp;

import java.util.Scanner;

public class ass2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] numbers = { 123, 32, 356, 53, 2, 67, 31, 78, 41, 9, 29 };

		while (true) {
			System.out.println("Input a number.");
			Scanner scanner = new Scanner(System.in);
			String inputs = scanner.nextLine();

			for (int i = 0; i < numbers.length; i++) {
				String strNum = String.valueOf(numbers[i]);
				
				if (strNum.contains(inputs)) {
					System.out.print(strNum + " ");
				}
			}System.out.println("");
		}
	}
}
