package firstprj;

import java.util.Calendar;
import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�� �Է� >> ");
		int year = scanner.nextInt();

		System.out.print("�� �Է� >> ");
		int month = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month - 1, 1);
		int week = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println();
		System.out.println("\t\t" + year + "�� " + month + "��");
		System.out.println("\t��\t��\tȭ\t��\t��\t��\t��");

		for (int i = 1; i < week; i++) {
			System.out.print("\t");// 1�� �� ���ϱ��� ���� ���
		}
		for (int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
			System.out.print("\t" + i);
			week++;
			if (week % 7 == 1) {
				System.out.println();
			}

		}
	}
}