public class CallStaticAndNonStatic_ForDatatype {

	static void addition() {

		int a = 5;

		int b = 6;

		int sum = (a + b);

		System.out.println("The addition of two value is ------>" + sum);
	}

	static void subtraction() {

		int a = 5;

		int b = 6;

		int sub = (b - a);

		System.out.println("The subtraction of two value is ------>" + sub);
	}

	static void multiplication() {

		int a = 5;

		int b = 6;

		int mul = (b * a);

		System.out.println("The multiplication of two value is ------>" + mul);
	}

	static void division() {

		int a = 10;

		int b = 5;

		int div = (a / b);

		System.out.println("The division of two value is ------>" + div);
	}

	static void moduleus() {

		int a = 10;

		int b = 5;

		int mod = (a % b);

		System.out.println("The modules of two value is ------>" + mod);
	}

	void addition1() {

		int a = 10;

		int b = 5;

		int add = (a + b);

		System.out.println("The addition of two value is ------>" + add);

	}

	public static void main(String[] args) {

		addition();
		subtraction();
		multiplication();
		division();
		moduleus();

		CallStaticAndNonStatic_ForDatatype mo = new CallStaticAndNonStatic_ForDatatype();
		mo.addition1();

	}

}