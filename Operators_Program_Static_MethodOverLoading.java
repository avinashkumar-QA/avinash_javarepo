
public class Operators_Program_Static_MethodOverLoading {

	static void operatorsStatic(int a, int b) {

		int sum = a + b;

		System.out.println("Result of addition is " + sum);

	}

	static void operatorsStatic(double a, double b) {

		double sub = a - b;

		System.out.println("Result of subtraction is " + sub);

	}

	static void operatorsStatic(int a, double b) {

		double mul = a * b;

		System.out.println("Result of multiplication is " + mul);

	}

	static void operatorsStatic(double a, int b) {
		double div = a / b;

		System.out.println("Result of division is " + div);

	}

	public static void main(String[] args) {

		operatorsStatic(4, 6);
		operatorsStatic(5.5, 4.9);
		operatorsStatic(12, 6.0);
		operatorsStatic(10.0, 5);

		/* MethodOverLoading mo= new MethodOverLoading(); mo.addition(9.0, 9); //class object and it's reference variable */
		//Operators_Program_Static_MethodOverLoading.operatorsStatic(4.9, 8.0); // we can call non-static method without
																				// any creating class ref. variable.

	}

}
