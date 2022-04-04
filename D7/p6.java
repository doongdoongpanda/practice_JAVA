package pp;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Input a sentence.");

			Scanner scanner = new Scanner(System.in);
			String inputs = scanner.nextLine();
			System.out.println("Input a alpabet to count.");
			String finds = scanner.nextLine();
			String[] inputArr = inputs.split("");
			String[] inputArr2 = inputs.split(" ");
			String[] findArr = finds.split("");

			if(findArr.length < 2) {
				countA(inputArr, finds);
			}
			else { 
				countB(inputArr2, finds);
			}
			}
	}
			
			public static void countA(String [] inputArr, String finds) {
			int count = 0;
			for(int i = 0; i <inputArr.length; i ++) {
				if (inputArr[i].contains(finds)) {
					count ++;
				}
			}
			
			System.out.print("Result : ");
			System.out.println(count);
		}
			
			public static void countB(String [] inputArr2, String finds) {
				int count = 0;
				for(int i = 0; i <inputArr2.length; i ++) {
					if (inputArr2[i].contains(finds)) {
						count ++;
					}
				}
				
				System.out.print("Result : ");
				System.out.println(count);
			}
				

	}


