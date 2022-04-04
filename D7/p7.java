package pp;

import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		char[] changer = input.toCharArray();// 단어를 한자한자 나눠놓음

		for (int i = 0; i < changer.length; i++) {
			char changed = (char)(219 - changer[i]);
				System.out.print(changed);
			}
		}
		
	}

