package revision;

public class Word_Reverse_01 {

	public static void main(String[] args) {

		String name = "Amar Ujala";
		String output = "";
		String[] words = name.split(" ");

		for (String p : words) {

			String reverserwords="";

			for (int i = p.length() - 1; i >= 0; i--) {

				reverserwords = reverserwords + p.charAt(i);

			}
			output = output + reverserwords + " ";
		}
		System.out.println(output);

	}

}
