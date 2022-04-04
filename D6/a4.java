package assignment1;
import java.util.Scanner;
public class a4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				String stringNum = scanner.nextLine();
				String[] num = stringNum.split(" ");//나눈다 	 
				double [] doubleNum = scanNum(num);
				double inputNum = scanNum2();
				comparison(doubleNum, inputNum, num);
				// TODO Auto-generated method stub
				}
				public static double[] scanNum(String[] num) {
				double[] doubleNum = new double[num.length];// 더블에 방을 만들어준다.
				for (int i = 0; i < num.length; i++) {
					doubleNum[i] = Double.parseDouble(num[i]);//숫자로 넣어준다. 
				}
				return doubleNum;
				}
				
				public static double scanNum2() {
				Scanner scanner = new Scanner(System.in);
				double inputNum = scanner.nextDouble(); // 다음 숫자 넣어준다.
				return inputNum;
				}
				
				public static void comparison(double[] doubleNum, double inputNum, String[] num) {
				// Finding the Nearest Number
				double maximum = 0;
				double minimum = 0; 
				double near = 0;
					
				double [] distanceNeg = new double[num.length];
				for (int j = 0; j < num.length; j++) {
				
					if(inputNum < 0) {//음수 양수로 나눔
					distanceNeg[j] = inputNum-doubleNum[j];
					}
					if(j == 0) {
						maximum =doubleNum[j];
					}else if(inputNum == doubleNum[j])
					{ maximum =doubleNum[j-1];
					}	
					else if(distanceNeg[j]>distanceNeg[j-1]){
						maximum = doubleNum[j];
					}
					}
				near = maximum;
				
				double [] distancePos = new double[num.length];
				for (int j = 0; j < num.length; j++) {
					if(inputNum >= 0) {
					distancePos[j] = inputNum-doubleNum[j];
					}if(j == 0) {
						minimum =doubleNum[j];
					}else if(inputNum == doubleNum[j])
					{ minimum =doubleNum[j-1];
					}	
					else if(distancePos[j]<distancePos[j-1]){
						minimum = doubleNum[j];
					}
					}
				near = minimum;
				System.out.println("nearest is : "+ near);
				}	
				}