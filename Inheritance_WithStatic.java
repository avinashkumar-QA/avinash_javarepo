package inheritance;

class Inheritance_ClassB {

	static void addition(double a, int b) {

		double add = a - b;

		System.out.println("The addition is ----> " + add);
	}

}

public class Inheritance_WithStatic extends Inheritance_ClassB {

	static void subtraction(double a, int b) {

		double sub = a - b;

		System.out.println("The subtraction is ----> " + sub);
	}

	public static void main(String[] args) {

		addition(67.8, 9);
		subtraction(80.8, 8);

	}

}
