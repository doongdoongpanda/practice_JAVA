package A1;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while (true) {
			String[] inputArr = scanInput();
			calculate(inputArr);
			System.out.println("");
		}
	}

	public static String[] scanInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a string.");
		String text = scanner.nextLine();
		String[] inputArr = text.split("");
		return inputArr;
	}

		public static void calculate (String[] inputArr) {
			int lengthtext = inputArr.length;
			int middle = lengthtext / 2;
			if (lengthtext % 2 == 0) {
				int middle2 = lengthtext / 2 - 1;
				System.out.println(inputArr[middle2] + inputArr[middle]);
			} else if (lengthtext % 2 == 1) {
				System.out.println(inputArr[middle]);
			}
		
	}
}
