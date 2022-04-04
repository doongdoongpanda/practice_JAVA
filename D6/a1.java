package assignment1;

import java.util.Scanner;

public class a1 {


		String[] courseArr = new String[5];
		
	public void firstmenu() {
		System.out.println("Menu");
		System.out.println("1.course list\n 2.my course\n->");
		choose();
		}
	public void choose() {
		Scanner scanner = new Scanner(System.in);
		int choice =scanner.nextInt();
		if (choice ==1) {
			secondMenu();
		}
		else if (choice ==2) {
			thirdMenu();
		}
	}
	
	public void secondMenu() {
		int count = 0;
		for(int i =0; i<5;i++) {
			//courseArr = new String[i];
			System.out.println("Course List");
		System.out.println("1.Korean\n 2.Math\n3.English\n4.Social Studies\n5.Science\n0.Back to menu\n->");
		
		Scanner scanner = new Scanner(System.in);
		int choice =scanner.nextInt();
		if(choice == 1) {
		System.out.println("\"Korean\"is registered\n");
		
		courseArr[count] = "Korean";
	}else if(choice == 2) {
		System.out.println("\"Math\"is registered\n");
		courseArr[count] = "Math";
		
	}
	else if(choice == 3) {
		System.out.println("\"English\"is registered\n");
	
		courseArr[count] = "English";
	}
	else if(choice == 4) {
		System.out.println("\"Social Studies\"is registered\n");

		courseArr[count] = "Social Studies";
	}
	else if(choice == 5) {
		System.out.println("\"Science\"is registered\\n");
		courseArr[count] = "Science";
		}
	else if(choice == 0) { 
		firstmenu();
		}count ++;
	}
}
	
	public void thirdMenu() {
		System.out.println("My course");
		
		for (int i = 1; i <= courseArr.length; i++) {
			System.out.println(i + ". " + courseArr[i-1]);
		}
		System.out.println("===END===\n");
		firstmenu();
	}
}

