package pp;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("input #1");
		String firstNum = scanner.nextLine();
		System.out.println("input #2");
		String secondNum = scanner.nextLine();
		String[] first = firstNum.split("");
		String[] second = secondNum.split("");
		List<String> firstL = new ArrayList<String>(Arrays.asList(first));
		List<String> secondL = new ArrayList<String>(Arrays.asList(second));
		List<Integer> listcount = new ArrayList<Integer>();
	
		for (int i = 0; i < second.length; i++) {// 문자가 서로같은지 확인 작업
			String getNum2 = secondL.get(i);
			for(int j = i; j<=i; j ++) {
			String getNum1 = firstL.get(j);
			
			if (getNum1.equals(getNum2)) {
				continue;
			} else {
				listcount.add(j);
				firstL.remove(j);
				firstL.add(new String(getNum1));
			
			}
		}
	}printList(listcount);
	}
		

	public static void printList(List<Integer> listcount) {
		System.out.print("결과 : ");
		for (int i : listcount) {
			System.out.print(" "+i);
		}
	}

}
