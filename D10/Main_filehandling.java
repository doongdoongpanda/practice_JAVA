package d10_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main_filehandling {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\kopo\\Desktop\\trafficvolume.csv"));
		ArrayList<Integer> aList = new ArrayList<Integer>();
		String line;

		while ((line = reader.readLine()) != null) {	
			String[] input1Arr = line.split(",");// 인풋어레이에 암아놓음 젛보
			if (input1Arr[1].equals("목")) {
				try {
					if (input1Arr[20] != null) {
						System.out.println(input1Arr[20]);
						aList.add(Integer.parseInt(input1Arr[20]));
					}
					
			}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		int sum = 0;
		try {
			System.out.println(aList);
			for (int i = 0; i < aList.size(); i++) {
				sum += aList.get(i);
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

		Collections.sort(aList);
		System.out.println("교통량 합계 : " + sum);
		System.out.println("교통량 평균 : " + sum / aList.size());
		System.out.println("교통량 최솟값 : " + aList.get(0));
		Collections.reverse(aList);
		System.out.println("교통량 최대값 : " + aList.get(0));
	}
}