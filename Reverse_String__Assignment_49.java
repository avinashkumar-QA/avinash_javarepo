package string_reverse_concept;

public class Reverse_String__Assignment_49 {

	public static void main(String[] args) {

		String name = "RAM";

		for (int i = 0; i < name.length(); i++) {

		char c = name.charAt(i);

		System.out.println(c);

		}

		for (int i = name.length() - 1; i >= 0; i--) {

		char c = name.charAt(i);

		System.out.println(c);
		}
	}
}
