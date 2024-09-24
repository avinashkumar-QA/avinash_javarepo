package inheritance;

class Inheritance_ClB {

	void addition(double a, int b) {

		double add = a + b;

		System.out.println("The Addition is ----> " + add);
	}

}

public class Inheritance_WithNonStatic extends Inheritance_ClB {

	void subtraction(double a, int b) {

		double sub = a - b;

		System.out.println("The Subtraction is ----> " + sub);
	}

	public static void main(String[] args) {

		Inheritance_WithNonStatic ob = new Inheritance_WithNonStatic();

		ob.addition(67.8, 9);
		ob.subtraction(80.9, 45);

	}

}
