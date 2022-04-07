package d10_main;

import java.util.Scanner;

public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numnps = numnpsResult();
		String ret = rpsResult();
		System.out.println("나: " + numnps);
		System.out.println("컴퓨터: " + ret);
		winResult(numnps, ret);
	}

	public static String numnpsResult() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String numnps = "";
		if (number == 0) {
			numnps = "Rock";
		} else if (number == 1) {
			numnps = "Paper";
		} else {
			numnps = "Scissor";
		}
		return numnps;
	}

	public static String rpsResult() {
		String ret = "";
		int randomNumber = (int) (Math.random() * 3);
		if (randomNumber == 0) {
			ret = "Rock";
		} else if (randomNumber == 1) {
			ret = "Paper";
		} else {
			ret = "Scissor";
		}
		return ret;
	}

	public static void winResult(String numnps, String ret) {

		if (numnps.equals(ret)) {
			System.out.println("Draw");
		}

		else if (numnps.equals("Rock")) {
			if (ret.equals("Scissor")) {
				System.out.println("Win");
			} else if (ret.equals("Paper")) {
				System.out.println("Lose");
			}
		}

		else if (numnps.equals("Scissor")) {
			if (ret.equals("Paper")) {
				System.out.println("Win");
			} else if (ret.equals("Rock")) {
				System.out.println("Lose");
			}

			else if (numnps.equals("Paper")) {
				if (ret.equals("Rock")) {
					System.out.println("Win");
				} else if (ret.equals("Scissor")) {
					System.out.println("Lose");
				}

			}
		}

	}
}