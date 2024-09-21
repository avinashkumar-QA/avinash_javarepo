package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_Method_4 {

	static void sum(int a, int b)
	{

		a = 10;
		b = 45;
		int sum = a + b;

		System.out.println("The result of sum is ---> " + sum);
	}

	static void sub(int a, int b) 
	{

		a = 90;
		b = 3;
		int sub = a - b;

		System.out.println("The result of sub is ---> " + sub);
	}

	public static void main(String[] args) {

		sum(0, 0);
		sub(0, 0);

	}

}
