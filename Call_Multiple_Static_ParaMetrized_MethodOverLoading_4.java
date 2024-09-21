package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_MethodOverLoading_4 {

	static void method1(int a, int b) 
	{
		int sum = a+b;
		System.out.println("The Result of addition is ---> " + sum);

	}

	static void method1(double a, int b) 
	{
		double sub = a-b;
		System.out.println("The Result of subtraction is ---> " + sub);
	}

	static void method1(double a, double b) 
	{

		double mul = a*b;
		System.out.println("The Result of multiplication is ---> " + mul);


	}

	public static void main(String[] args) 
	{
		method1(4,3);
		method1(5.0,4);
		method1(8.0,2.0);

	}

}
