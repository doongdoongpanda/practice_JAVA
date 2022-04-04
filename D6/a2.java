package assignment1;

import java.util.Scanner;

public class a2 {

	public String scanNum() {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		return number;
	}

	public void reverse(String number) {
		String newnum = "";
		for (int i = number.length()-1; i >= 0; i--) {
			newnum = newnum + number.charAt(i);
		}
		System.out.println(newnum);
	}
}
