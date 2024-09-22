
public class Operators_Program_NonStatic_MethodOverloading {

	void opertaors_nonstaticOverloading(int a, double b) {

		double add = a + b;
		System.out.println("Result of addition is --->" + add);

	}

	void opertaors_nonstaticOverloading(double a, int b) {

		double sub = a - b;
		System.out.println("Result of subtraction is --->" + sub);

	}

	/* Doubt---> printing wrong value for multiplication and message is also showing in division instead of multiplication *///this will handled by type casting as of now don't use long and short.
	
	void opertaors_nonstaticOverloading(long a, long b) {

		long mul = a * b;
		System.out.println("Result of multiplication is --->" + mul);
	}

	void opertaors_nonstaticOverloading(int a, int b) {

		int div = a / b;
		System.out.println("Result of division is --->" + div);

	}

	void opertaors_nonstaticOverloading(double a, double b) {
		double mod = a % b;
		System.out.println("Result of modulos is --->" + mod);
	}

	public static void main(String[] args) {

		Operators_Program_NonStatic_MethodOverloading op = new Operators_Program_NonStatic_MethodOverloading();
		op.opertaors_nonstaticOverloading(1, 8.0);
		op.opertaors_nonstaticOverloading(15.5, 10);
		op.opertaors_nonstaticOverloading(8, 4); // long
		op.opertaors_nonstaticOverloading(4, 4);
		op.opertaors_nonstaticOverloading(16.8, 8.0);

	}

}
