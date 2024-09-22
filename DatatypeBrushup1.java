public class DatatypeBrushup1 {

	public static void main(String[] args) {

		int myNumber = 4;
		String name = "Avinash";
		char transit = 'D';
		double t1 = 4.55;
		float t2 = 4567;
		boolean automate = true;

		System.out.println(myNumber);
		System.out.println(name);
		System.out.println(transit);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(automate);

		// Arrays: To store more than one value

		int[] arrays1 = { 1, 2, 3, 4, 5 };
		System.out.println(arrays1[2]);// printing 3
		String[] arrays2 = { "ram", "shyam" };
		System.out.println(arrays2[1]); // printing shyam

		for (String s : arrays2) {

			System.out.println(s); // printing ram, shyam

		}

		// second way to store the array value in these forms:

		int[] arrays3 = new int[5];
		arrays3[0] = 1;
		arrays3[1] = 5;
		arrays3[2] = 8;
		arrays3[3] = 9;
		arrays3[4] = 82;
		System.out.println(arrays3[4]); // printing 82

		// Loop

		for (int i = 0; i < arrays3.length; i++) {

			System.out.println(arrays3[i]); // printing 1, 5,8,9,82
		}

		for (int i = 0; i < arrays3.length; i++) {

			if (arrays3[i] % 2 == 0) {

				System.out.println(arrays3[i] + "this is multiple of 2"); // printing 8, 82
				// break; //printing 1, 5,8

			}

			else {

				System.out.println(arrays3[i] + "this is not multiple of 2"); // printing 1,5,9

			}

		}

	}
}