package constructor.thiscalling;

public class Parametrized_Constructor_Calling_With_Thiskeyword {

	Parametrized_Constructor_Calling_With_Thiskeyword() {
		this(false);
		System.out.println("This calling statement constructor-1");

	}

	Parametrized_Constructor_Calling_With_Thiskeyword(boolean a) {
		
		System.out.println("This calling statement constructor-2");

	}

	public static void main(String[] args) {

		new Parametrized_Constructor_Calling_With_Thiskeyword();

	}

}
