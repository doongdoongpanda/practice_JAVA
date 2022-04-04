package assignment1;

import java.util.Scanner;

public class d6_a5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printunit();
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		int second = scanner.nextInt();
		System.out.println("Input number");
		int inputNum = scanner.nextInt();
		calculate(first, second, inputNum);

	}

	public static void printunit() {
		System.out.println("# Unit");
		System.out.println("1. cm\n2. m\n3. mm\n4. km\n5. mile");
		System.out.println("Input two unit");
	}

	public static void calculate(int first, int second, double inputNum) {
		if (first == 1) {
			cm(second, inputNum);
		} else if (first == 2) {
			m(second, inputNum);
		} else if (first == 3) {
			mm(second, inputNum);
		} else if (first == 4) {
			km(second, inputNum);
		} else if (first == 5) {
			mile(second, inputNum);
		}
	}

	public static void cm(int second, double inputNum) {
		double result = 0;
		if (second == 1) {
			result = inputNum;
		} else if (second == 2) {
			result = inputNum / 100;
		} else if (second == 3) {
			result = inputNum * 10;
		} else if (second == 4) {
			result = inputNum / 100000;
		} else if (second == 5) {
			result = (float) (inputNum * 6.2137);
		} else {
			System.out.println("Wrong Number");
		}
		System.out.println(result);
	}

	public static void m(int second, double inputNum) {
		double result = 0;
		if (second == 1) {
			result = inputNum * 100;
		} else if (second == 2) {
			result = inputNum;
		} else if (second == 3) {
			result = inputNum * 1000;
		} else if (second == 4) {
			result = inputNum / 1000;
		} else if (second == 5) {
			result = (float) (inputNum * 0.000621);
		} else {
			System.out.println("Wrong Number");
		}
		System.out.println(result);
	}

	public static void mm(int second, double inputNum) {
		double result = 0;
		if (second == 1) {
			result = inputNum / 10;
		} else if (second == 2) {
			result = inputNum / 1000;
		} else if (second == 3) {
			result = inputNum;
		} else if (second == 4) {
			result = (float) (inputNum * 1e-6);
		} else if (second == 5) {
			result = (float) (inputNum * 6.2137);
		} else {
			System.out.println("Wrong Number");
		}
		System.out.println(result);
	}

	public static void km(int second, double inputNum) {
		double result = 0;
		if (second == 1) {
			result = inputNum * 100000;
		} else if (second == 2) {
			result = inputNum * 1000;
		} else if (second == 3) {
			result = inputNum * 1000000;
		} else if (second == 4) {
			result = inputNum;
		} else if (second == 5) {
			result = (float) (inputNum * 0.621371);
		} else {
			System.out.println("Wrong Number");
		}
		System.out.println(result);
	}

	public static void mile(int second, double inputNum) {
		double result = 0;
		if (second == 1) {
			result = (float) (inputNum * 1690934.4);
		} else if (second == 2) {
			result = (float) (inputNum * 1609.344);
		} else if (second == 3) {
			result = inputNum * 1609344;
		} else if (second == 4) {
			result = (float) (inputNum * 1.609344);
		} else if (second == 5) {
			result = inputNum;
		} else {
			System.out.println("Wrong Number");
		}
		System.out.println(result);
	}
}
