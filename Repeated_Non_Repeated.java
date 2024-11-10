package crosskt;

public class Repeated_Non_Repeated {

	public static void main(String[] args) {

		String name = "abccdf";

		for (char c : name.toCharArray()) {

		if (name.indexOf(c) == name.lastIndexOf(c)) {

		System.out.println("The Non- character from the given  String is ---> " + c);
		
			}

		}
	}
}
