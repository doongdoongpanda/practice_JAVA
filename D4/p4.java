package firstprj;

import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Create you own encryption algorithm");
		System.out.println("a->e, e->i, i->o, o->u, u->a");
		System.out.print("#Menu\n1.Encryption\n2.Decryption\n->");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		System.out.print("Result : ");

		String[] stringArr = input.split("");// 단어를 한자로 나눠놓음
		String consonant = "aeiou";

		String[] con = consonant.split("");// 모음 한자로 나눠놈

		for (int i = 0; i < stringArr.length; i++) {
			if (stringArr[i].equals(con[0])) {
				stringArr[i] = "e";
				System.out.print(stringArr[i]);
			} else if (stringArr[i].equals(con[1])) {
				stringArr[i] = "i";
				System.out.print(stringArr[i]);
			} else if (stringArr[i].equals(con[2])) {
				stringArr[i] = "o";
				System.out.print(stringArr[i]);
			} else if (stringArr[i].equals(con[3])) {
				stringArr[i] = "u";
				System.out.print(stringArr[i]);
			} else if (stringArr[i].equals(con[4])) {
				stringArr[i] = "a";
				System.out.print(stringArr[i]);
			} else {
				System.out.print(stringArr[i]);
			}
		}
		System.out.print("\n#Menu\n2.Decryption\n3.Encryption\n->");
		String input2 = scanner.nextLine();
		System.out.print("Result : ");
		String[] stringArr2 = input2.split("");// 단어를 한자로 나눠놓음

		for (int i = 0; i < stringArr2.length; i++) {
			if (stringArr2[i].equals(con[0])) {
				stringArr2[i] = "u";
				System.out.print(stringArr2[i]);
			} else if (stringArr2[i].equals(con[1])) {
				stringArr2[i] = "a";
				System.out.print(stringArr2[i]);
			} else if (stringArr2[i].equals(con[2])) {
				stringArr2[i] = "e";
				System.out.print(stringArr2[i]);
			} else if (stringArr2[i].equals(con[3])) {
				stringArr2[i] = "i";
				System.out.print(stringArr2[i]);
			} else if (stringArr2[i].equals(con[4])) {
				stringArr2[i] = "o";
				System.out.print(stringArr2[i]);
			} else {
				System.out.print(stringArr2[i]);
			}
		}
	}
}