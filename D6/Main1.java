package p2;


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		additional additional = new additional ("A",200, 30.5, 32.1);
		additional add1 = new additional ("b", 123, 47.1, 18.9);
		additional add2 = new additional ("c", 765, 21.6, 42.3);
		additional add3 = new additional ("d");
		additional.printAll();
		add1.printAll();
		add2.printAll();
		add3.printAll();
	}
}
