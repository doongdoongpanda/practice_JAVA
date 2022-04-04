package pp;

import java.util.Scanner;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			
			System.out.println("Input a sentence.");

			Scanner scanner = new Scanner(System.in);
			String inputs = scanner.nextLine();
			
			System.out.println("Input a alpabet to count.");
			String finds = scanner.nextLine();
			
			String[] inputArr = inputs.split("");

			int count = 0;
			int i = 0;
			while (i >= 0) {
				if (inputArr[i].equals(finds)) {
					count = i + 1;
					i = -1;
				} else {
					i++;
				}
			}
			System.out.print("Result : ");
			System.out.println(count);
		}
	}
}
