package assignment1;

import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input the number of numbers.");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		String numberArr = "";
		
		for(int i = 0; i < count; i ++) {
			numberArr[i] =scanner.nextFloat();
		}
	}

}
