package d10_main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class thread_sleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date time = new Date();
		System.out.println("START : " + time.getHours() + "h" + time.getMinutes() + "m" + time.getSeconds() + "s");
		Scanner scanner = new Scanner(System.in);
		int ss = scanner.nextInt();
		scanner.close();
		Thread thread = new Thread();
		thread.start();

		int getsec = time.getSeconds();
		int alarm = getsec + ss;//묶은 시간을 입력값과 합춰준다.
	
		if (alarm >= 60) {
			alarm = alarm - 60;
			getsec = getsec - 60;
		}
		int turn = 0;
		while (turn < alarm) {
			try {
				Calendar time2 = Calendar.getInstance();
				if (time2.get(Calendar.SECOND) >= alarm) {
					System.out.println("time is over - " + time2.get(Calendar.HOUR_OF_DAY) + "h" + time2.get(Calendar.MINUTE) + "m" + time2.get(Calendar.SECOND)+ "s");
					turn = alarm;
				} else { 
					Thread.sleep(1000);
					turn ++; 
				}
			
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("error");
			}
		}

	
}
}
