package D9_main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ass_1_1 {

	public static void main(String[] args) {

		ArrayList<Integer> rankList = new ArrayList<Integer>();
		String[] outName = new String[5];
		String[] fullInfo = new String[5];
		System.out.println("inputs the 5 sets of names and scores");
		for (int i = 0; i < 5; i++) {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			fullInfo[i] = input;
			String[] input1Arr = input.split(" ");
			outName[i] = input1Arr[0];
			int score = Integer.parseInt(input.substring(input.lastIndexOf(" ") + 1));
			rankList.add(score);
		}
		Collections.sort(rankList);
		Collections.reverse(rankList);
		Object[] object = rankList.toArray();
		System.out.println("\n#Rank");
		for (int i = 0; i < object.length; i++) {
			String objectInt = String.valueOf(object[i]);
			
			for (int j = 0; j < fullInfo.length; j++) {
				if (fullInfo[j].contains(objectInt)) {
					System.out.print(outName[j] + " ");
				}
			}
		}

	}

}