package pp;

import java.util.Arrays;

public class p4 {

	public static void main(String[] args) {// 오름차순
		// TODO Auto-generated method stub
		int[] numbers = { 2, 33, 7, 5, 12, 34, 99, 25, 38, 53, 20 };
		int temp = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for (int j = 1+ i; j < numbers.length; j++){
				if( numbers[i] > numbers[j]) {
				temp = numbers[i];
				numbers[i] =numbers[j];
				numbers[j] = temp;
			}
		}
		}
		System.out.println(Arrays.toString(numbers));	
	}		
}
		
