package pp;

import java.util.Scanner;

public class additional_ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first = scanNum1();// ù��° �ð��� �޴´�.
		String second = scanNum2();// �ι�° �ð��� �޴´�.
		calculate(first, second);// ����Ѵ�.
	}

	public static String scanNum1() {// ���� h, m, s�� �����ؾ��Ѵ�. ��ĭ���⸦ �����ش�.
		System.out.println("input the first time. ex)00h 00m 00s");
		Scanner scanner = new Scanner(System.in);
		String first = scanner.nextLine();
		return first;
	}

	public static String scanNum2() {
		System.out.println("input the first time. ex)00h 00m 00s");
		Scanner scanner = new Scanner(System.in);
		String second = scanner.nextLine();
		return second;
	}

	public static void calculate(String first, String second) {
		// string�� �ɰ��� ������ ��ȯ���ش�.
		int hour1 = first.indexOf("h");
		String strhour1 = first.substring(0, hour1);
		int hour1Int = Integer.parseInt(strhour1);
		int mm1 = first.indexOf("m");
		String strmm1 = first.substring(hour1 + 2, mm1);
		int mm1Int = Integer.parseInt(strmm1);
		int ss1 = first.indexOf("s");
		String strss1 = first.substring(mm1 + 2, ss1);
		int ss1Int = Integer.parseInt(strss1);
		int hour2 = second.indexOf("h");
		String strhour2 = second.substring(0, hour2);
		int hour2Int = Integer.parseInt(strhour2);
		int mm2 = second.indexOf("m");
		String strmm2 = second.substring(hour2 + 2, mm2);
		int mm2Int = Integer.parseInt(strmm2);
		int ss2 = second.indexOf("s");
		String strss2 = second.substring(mm2 + 2, ss2);
		int ss2Int = Integer.parseInt(strss2);
		// �Է°�2���� ū ���� ����
		int biggerh = 0, biggerm = 0, biggers = 0;
		int smallerh = 0, smallerm = 0, smallers = 0;
		if ((hour1Int * 10000 + mm1Int * 100 + ss1Int) >= (hour2Int * 10000 + mm2Int * 100 + ss2Int)) {
			biggerh = hour1Int;
			biggerm = mm1Int;
			biggers = ss1Int;
			smallerh = hour2Int;
			smallerm = mm2Int;
			smallers = ss2Int;

		} else {
			biggerh = hour2Int;
			biggerm = mm2Int;
			biggers = ss2Int;
			smallerh = hour1Int;
			smallerm = mm1Int;
			smallers = ss1Int;
		}
		// ū������ ���� ���� ����.
		int fillcount = 0; // m�̳� s�� ������� �մ������� 60�� �����´�.
		int sums = 0;
		if (biggers >= smallers) {
			sums = biggers - smallers;

		} else {
			sums = biggers - smallers + 60;

			fillcount++;
		}

		int summ = 0;
		if (biggerm >= smallerm) {
			summ = biggerm - smallerm - fillcount;
		} else {
			summ = biggerm - smallerm + 60 - fillcount;
			fillcount = 0;
			fillcount++;
		}

		int sumh = biggerh - smallerh - fillcount;
		// ������� ����Ѵ�.
		System.out.println("��� : " + sumh + "h " + summ + "m " + sums + "s");
	}
}
