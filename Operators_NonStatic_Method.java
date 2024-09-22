public class Operators_NonStatic_Method {

	void addition() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Result of addition is --->  " + sum);

	}

	// statement in the form of non_static_parametrized//
	void subtraction(int a, double b) {
		double sub = a - b;
		System.out.println("Result of subtraction is --->  " + sub);

	}

	void multiplication() {
		int a = 30;
		int b = 20;
		int mul = a * b;
		System.out.println("Result of multiplication is --->  " + mul);
	}

	void division() {
		int a = 40;
		int b = 10;
		int div = a / b;
		System.out.println("Result of division is ---> " + div);

	}

	void modulos() {
		int a = 80;
		int b = 40;
		int mod = a % b;
		System.out.println("Result of modulos is ---> " + mod);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operators_NonStatic_Method onsm = new Operators_NonStatic_Method();
		onsm.addition();
		onsm.subtraction(10, 5.4);
		onsm.multiplication();
		onsm.division();
		onsm.modulos();

	}

}
