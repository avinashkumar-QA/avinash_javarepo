package Variable;

import java.util.Scanner;

public class Scanner_Global_Variable {

	Scanner sc = new Scanner(System.in);

	void addition() {
		System.out.println("Please Enter the First Value");
		int a = sc.nextInt();

		System.out.println("Please Enter the Second Value");
		int b = sc.nextInt();

		int add = a + b;
		System.out.println("The result of addition is ----> " + add);

	}

	void addition(int o, int p) {
		System.out.println("Please Enter the First Value");
		int u = sc.nextInt();

		System.out.println("Please Enter the Second Value");
		int k = sc.nextInt();

		int sub = u - k;
		System.out.println("The result of Subtraction is ----> " + sub);

	}

	void multiplication(int o, int p) {
		System.out.println("Please Enter the First Value");
		double u = sc.nextDouble();

		System.out.println("Please Enter the Second Value");
		double k = sc.nextDouble();

		double mul = u * k;
		System.out.println("The result of multiplication is ----> " + mul);

	}


	public static void main(String[] args) {

		Scanner_Global_Variable sgv=new Scanner_Global_Variable();
		sgv.addition();
		sgv.addition(0, 0);
		sgv.multiplication(0, 0);

	}

}
