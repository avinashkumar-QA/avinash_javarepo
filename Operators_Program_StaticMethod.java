
public class Operators_Program_StaticMethod {

	static void addition() {
		int a = 10;
		double b = 10.9;
		double sum = (a + b);
		System.out.println("The addition result is --->" + sum);

	}

	static void subtraction() {

		int a = 16;
		double b = 10;
		double sub = (a - b);
		System.out.println("The subtraction result is --->" + sub);

	}

	static void multiplication() {

		int a = 13;
		double b = 13;
		double mul = (a * b);
		System.out.println("The multiplication result is --->" + mul);

	}

	static void division() {

		int a = 40;
		double b = 5;
		double div = (a / b);
		System.out.println("The division result is --->" + div);

	}

	static void modulos() {

		int a = 80;
		double b = 10;
		double mod = (a % b);
		System.out.println("The modulos result is --->" + mod);

	}

	public static void main(String[] args) {

		addition();
		subtraction();
		multiplication();
		division();
		modulos();

	}

}
