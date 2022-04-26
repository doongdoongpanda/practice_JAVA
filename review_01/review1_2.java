package review1;

import java.util.Scanner;

public class review1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("input numbers by each conditioning, m/s, km/h, m/ms");
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		double thirdNum = scanner.nextDouble();
		double [] original = {firstNum, secondNum, thirdNum};
		String [] unit = { "m/s", "km/h", "m/ms"};
		int [] value = new int[3];
		value[0] = firstNum; 
		value[1]= calculate2(secondNum);
		value[2]= calculate3(thirdNum);
		int MAX = value[0];
		int MAX_i = 0;
		for(int i=0 ; i <3; i++) {
			if(value[i] > MAX ) {
				MAX = value[i];
				MAX_i = i;
				}
			}
		System.out.println("The quickest is : " + original[MAX_i] +unit[MAX_i]);
	}
	
	public static int calculate2(double secondNum) {
		int changeunit2 = (int) (secondNum*1000*360);
		return changeunit2;	
	}
	public static int calculate3(double thirdNum) {
			int changeunit2 = (int) (thirdNum*1000);
		return changeunit2;	
	}
}
