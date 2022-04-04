package pp;

public class p5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] array = { { "jeong", "70", "80", "100" }, { "Pyo", "60", "70", "86" }, { "Choi", "54", "100", "82" },
				{ "mike", "87", "95", "79" } };
		String[] name = new String[4];
		int[] summation = new int[4];
		int min = 0;
		int max = 0;
		int people = array.length;
		String[][] subject = { { "name", "korean", "english", "math" }, null, null, null };
		// korean Á¡¼ö
		for (int i = 1; i < array.length; i++) {
			int total = 0;
			double average = 0;
			for (int j = 0; j < array.length; j++) {
				summation[j] = Integer.parseInt(array[j][i]);

				total += summation[j];
				average = (double) (total / people);
				if (j == 0) {
					max = Integer.parseInt(array[j][i]);
				} else if (Integer.parseInt(array[j][i]) > max) {
					max = Integer.parseInt(array[j][i]);
				}
				if (j == 0) {
					min = Integer.parseInt(array[j][i]);
				} else if (Integer.parseInt(array[j][i]) < min) {
					min = Integer.parseInt(array[j][i]);
				}

			}
			System.out.print(subject[0][i]);
			System.out.println(" score\n" + " total : " + total + " average : " + average);
			System.out.println(" Min : " + min + " Max : " + max);
		}

		for (int m = 0; m < array.length; m++) {
			name[m] = array[m][0];
			System.out.print(name[m] + ", ");
		}
		System.out.println("are attended");
	}
}
