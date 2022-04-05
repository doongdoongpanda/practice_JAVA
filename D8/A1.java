package A1;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Input the numbers on firstline.");
			String input1 = scanner.nextLine();
			System.out.println("Input the numbers to compare");
			String input2 = scanner.nextLine();
			String[] inputArr1 = input1.split(" ");
			String[] inputArr2 = input2.split(" ");

			for (int i = 0; i < inputArr1.length; i++) {
				double input1doub = Double.parseDouble(inputArr1[i]);
				for (int j = 0; j < inputArr2.length; j++) {
					double input2doub = Double.parseDouble(inputArr2[j]);
					if (input1doub == input2doub) {
						System.out.print(input2doub + " ");
					}
				}
			}System.out.println("\n");
		}
	}
}