package firstprj;

import java.util.Scanner;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("#1 : The string length should be over 8.");
		System.out.println("#2 : The string should contains at least one capital.");
		System.out.println("#3 : Capitals shouldn't be over 5.");
		System.out.println("#4 : The string should contains at least 2 numbers.");
		System.out.println("#5 : The string length should not contain same alphabets in a row");

		while (true) {
			System.out.print("-> ");
			Scanner scanner = new Scanner(System.in);
			String inputPwd = scanner.nextLine();
			char[] text = inputPwd.toCharArray();// �ܾ �������� ��������
			int fail = 0, countA = 0, count1 = 0;
			if (text.length < 8) {// ù��° ���� ���� Ȯ��
				fail++;
			}
			for (int i = 0; i < text.length; i++) {

				if (text[i] <= 90 && text[i] >= 65) {
					countA++;
				}
			}
			if (countA > 5 || countA < 1) { // �ι�°, ����° ���� ���� Ȯ��
				fail++;
			}
			for (int i = 0; i < text.length; i++) {// �׹�° ���� ���� Ȯ��
				if (text[i] >= 48 && text[i] <= 57) {
					count1++;
				}
				if (text[i] == (char)(text[i] + 1)) {// �ټ���° ���� Ȯ��
					fail++;
				}
			}
			if (count1 < 2) {
				fail++;
			}
			if (fail > 0) {
				System.out.println("FAIL");
			} else {
				System.out.println("PASS");
			}
		}
	}
}
