package firstprj;

import java.util.Scanner;

public class additional_assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String count = scanner.nextLine();// 숫자를 받는다

		String number = scanner.nextLine();// 숫자를 띄어쓰기로 받는다일단 배운대로 string기준으로 받아볼까
		String[] numberArr = number.split(" ");// 단어를 띄어쓰기로 나눠놓음

		scanner.close();

		int countInt = Integer.parseInt(count);
		float average = 0;
		int minimum = 0, maximum = 0, summation = 0;

		for (int i = 0; i < countInt; i++) {
			int numberInt = Integer.parseInt(numberArr[i]);// 정수형 타입으로 변환

			if (i == 0) {
				maximum = numberInt;
				minimum = numberInt;
			} else if (numberInt > maximum) {
				maximum = numberInt;
			} else if (numberInt < minimum) {
				minimum = numberInt;
			}
			summation += numberInt;
		}

		System.out.print("Average : ");
		System.out.println((float) summation / countInt);
		System.out.print("Minimum : ");
		System.out.println(minimum);
		System.out.print("Maximum : ");
		System.out.println(maximum);
		System.out.print("Summation : ");
		System.out.println(summation);
	}
}
