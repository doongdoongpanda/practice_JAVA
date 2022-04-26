package review1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class review1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int turn = 0;
		while (turn < 10) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("input #1");
			String firstNum = scanner.nextLine();
			System.out.println("input #2");
			String secondNum = scanner.nextLine();
			String[] first = firstNum.split("");
			String[] second = secondNum.split("");
			List<String> firstL = new ArrayList<String>(Arrays.asList(first));
			List<String> secondL = new ArrayList<String>(Arrays.asList(second));
			int j = 0;
			int cnt = 0;
			for (int i = 0; i < first.length; i++) {
				String getNum1 = firstL.get(i);

				while (j == i) {
					String getNum2 = secondL.get(j);
					
					if (getNum1.equals(getNum2)) {
						cnt++;j++;
						continue;
					} else {
						secondL.remove(getNum2);
						secondL.add(getNum2);
						j = i;
						cnt++;
						if (cnt == 20) {
							break;
						}
					}
				}
			}
			String firsts = firstL.toString().replaceAll(" ", "");
			String seconds = secondL.toString().replaceAll(" ", "");
			if (firsts.equals(seconds)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		turn++;
	}
}