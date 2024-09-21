package practice.javaprogram;

public class Call_Multiple_Static_NonParaMetrized_Method_Rule1 {

	static void add() {

		int a = 10;
		int b = 20;
		int addition = a + b;
		System.out.println("The Result of Addition is ---->  " + addition);

	}

	static void sub() {
		int a = 10;
		int b = 20;
		int subtraction = a - b;
		System.out.println("The Result of subtraction is ---->  " + subtraction);

	}

	static void mul() {
		int a = 10;
		int b = 20;
		int multiplication = a * b;
		System.out.println("The Result of multiplication is ---->  " + multiplication);

	}

	static void div() {
		int a = 10;
		int b = 20;
		int division = a / b;
		System.out.println("The Result of division is ---->  " + division);

	}

	static void mod() {
		int a = 10;
		int b = 20;
		int modulos = a % b;
		System.out.println("The Result of modulos is ---->  " + modulos);

	}

	public static void main(String[] args) {

		add();
		sub();
		mul();
		div();
		mod();

	}

}
