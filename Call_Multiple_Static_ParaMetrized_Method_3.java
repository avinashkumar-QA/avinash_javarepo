package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_Method_3 {

	static void add(int a, int b) {
		int sum = a + b;
		System.out.println("The addition result is ---> " + sum);
	}

	static void sub(int a, int b) {
		int sub = a - b;
		System.out.println("The subtraction result is ---> " + sub);
	}

	static void mul(int a, int b) {
		int mul = a * b;
		System.out.println("The multiplication result is ---> " + mul);
	}

	static void div(int a, int b) {
		int div = a / b;
		System.out.println("The division result is ---> " + div);
	}

	static void mod(int a, int b) {
		int mod = a % b;
		System.out.println("The modulos result is ---> " + mod);
	}

	static void sb(String a, boolean b) {
		System.out.println("The addition result is ---> " + (a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(5, 9);
		sub(10, 5);
		mul(9, 5);
		div(8, 5);
		mod(5, 3);
		sb(" Aman " , true);

	}

}
