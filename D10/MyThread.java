package d10_main;

import java.util.Random;
import java.util.Scanner;

public class MyThread implements Runnable{

	 

	  public static void main(String[] args) {
	    // create thread objects
		  Scanner scanner = new Scanner(System.in);
		    int input = scanner.nextInt();	
		  Runnable  runner  = new runnable();
		  Thread thread2 = new Thread( runner );
		  thread2.start();
		  Runnable runnable = new runnable();
	  Thread thread1 = new Thread(runnable);
	  thread1.start();
	  
	  int [] runnerArr = new int [input];	
		 for ( int i = 0; i < input; i ++) {
			 System.out.println( "( "+ i+ "s )");
		 
		 try {
		    	Thread.sleep(5000);
		    } catch (InterruptedException e) {
		      e.printStackTrace();
		    }
		 
		 
		 Random random = new Random();
		  int [] secondArr = new int [input];
		  for( i = 0 ; i < input ; i ++ ) {
		  int runSec = random.nextInt(20);
		  secondArr[i] = runSec;
		  }
		  try {
			  Thread.sleep(1000);
		  }catch (InterruptedException e) {
			  e.printStackTrace();
		  }
		  for ( int j = 0; j < secondArr.length; j ++) {
			  System.out.println(secondArr[j]* j );
			  
	    try {
	    	Thread.sleep(1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	 
	  } 
	  
	  }
	  }
}