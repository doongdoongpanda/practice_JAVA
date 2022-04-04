package p3;

import p2.additional;

public class main_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		additional additional = new additional ("A",200, 30.5, 32.1);
		additional add1 = new additional ("b", 123, 47.1, 18.9);
		additional add2 = new additional ("c", 765, 21.6, 42.3);
		additional.printout();
		add1.printout();
		add2.printout();
		
	}
}
