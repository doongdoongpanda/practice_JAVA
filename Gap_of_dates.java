package firstprj;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Gap_of_dates {

	public static void main(String[] args) {
		System.out.print("비교 날짜 6자리 입력 >> 1.");

		Scanner scanner = new Scanner(System.in);
		int date1 = scanner.nextInt();
		System.out.print("비교 날짜 6자리 입력 >> 2.");
		int date2 = scanner.nextInt();

		int year_part1 = date1 / 10000;
		int year_part2 = date2 / 10000;

		int month_part1 = (date1 - year_part1 * 10000) / 100;
		int month_part2 = (date2 - year_part2 * 10000) / 100;

		int date_part1 = date1 - year_part1 * 10000 - month_part1 * 100;
		int date_part2 = date2 - year_part2 * 10000 - month_part2 * 100;

		Calendar set_date1 = Calendar.getInstance();
		Calendar set_date2 = Calendar.getInstance();

		set_date1.set(year_part1, month_part1 - 1, date_part1);
		set_date2.set(year_part2, month_part2 - 1, date_part2);

		System.out.println(set_date1.get(Calendar.DAY_OF_YEAR) - set_date2.get(Calendar.DAY_OF_YEAR));
	}
}