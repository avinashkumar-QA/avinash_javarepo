package java_string;

import java.util.Arrays;

public class Find_Alphabates_Space_Number_GivenString {

	static int alphacount;
	static int number;
	static int space;

	static int specialchar;

	public static void main(String[] args) {

		String name = "Welcome12 to my@ !   world";

		char[] s = name.toCharArray();

		System.out.println(Arrays.toString(s));

		for (int i = 0; i < name.length(); i++) {

			boolean b1 = Character.isAlphabetic(s[i]);

			if (b1 == true) {

				alphacount++;

			}
			boolean b2 = Character.isDigit(s[i]);

			if (b2 == true) {

				number++;

			}

			boolean b3 = Character.isWhitespace(s[i]);

			if (b3 == true) {

				space++;

			}

		}

		System.out.println("The alphbates count is ----> " + alphacount);
		System.out.println("The number count is ----> " + number);
		System.out.println("The space count is ----> " + space);

		int countofspecialchar = name.length() - (alphacount + number + space);

		System.out.println("The special char count is ----> " + countofspecialchar);

	}
}
