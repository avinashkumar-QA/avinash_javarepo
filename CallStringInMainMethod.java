
public class CallStringInMainMethod {

	static String name = "Aarti";

	static String name1[] = { "Ramj", "Shyam", "Kaushal" };

	static String[] fruits = new String[3];

	public static void main(String[] args) {

		// System.out.println(name);

		// System.out.println(name1[2]);

		fruits[0] = "banana";
		fruits[1] = "apple";
		fruits[2] = "gauva";

		// System.out.println(fruits[1]);

		/*
		 * for(int k=0; k<fruits.length; k++) {
		 * 
		 * System.out.println(fruits[k]);
		 */

		for (String s : fruits) {

			System.out.println(s);
		}

	}

}
