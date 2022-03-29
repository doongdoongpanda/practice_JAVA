package firstprj;

import java.util.Calendar;
import java.util.Scanner;

public class calendar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("년 입력 >> ");
		int year = scanner.nextInt();

		System.out.print("월 입력 >> ");
		int month = scanner.nextInt();

		Calendar calendar = Calendar.getInstance();

		calendar.set(year, month - 1, 1);
		int week = calendar.get(Calendar.DAY_OF_WEEK);

		System.out.println();
		System.out.println("\t\t" + year + "년 " + month + "월");
		System.out.println("\t일\t월\t화\t수\t목\t금\t토");

		for (int i = 1; i < week; i++) {
			System.out.print("\t");// 1일 전 요일까지 공백 출력
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