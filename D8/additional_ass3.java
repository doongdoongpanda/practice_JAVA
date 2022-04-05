package A1;

import java.util.Scanner;

public class additional_ass3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number.");
		int input1 = sc.nextInt();// 첫번째입력값
		sc.nextLine();
		int turn = 0;
		String[] inputArr2 = null;
		while (turn == 0) {
			System.out.println("Input numbers to compare");
			String input2 = sc.nextLine();// 두번째 입력값
			inputArr2 = input2.split(" ");
			if (inputArr2.length != input1) {
				System.out.println("Input numbers again.\n");
			} else {
				turn++;
			}
		}
		System.out.println("Input a number.");
		int input3 = sc.nextInt();
		calculate(input3, inputArr2);
	}

	public static void calculate(int input3, String[] inputArr2) {
		int[] arrayInt = new int[inputArr2.length];
		for (int j = 0; j < inputArr2.length; j++) {
			int input1Int = Integer.parseInt(inputArr2[j]);
			arrayInt[j] = input1Int;// 정수배열로 바꿈
		}
		for (int k = 0; k < arrayInt.length; k++) {
			for (int l = 1 + k; l < arrayInt.length; l++) {
				if (arrayInt[k] < arrayInt[l]) {
					int compare = arrayInt[l];
					arrayInt[l] = arrayInt[k];
					arrayInt[k] = compare;
				}
			}
		}
		System.out.println(arrayInt[input3 - 1]);
	}
}
