package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_MethodOverLoading_3 {

	static void method1(int a, int b) 
	{
		a=10;
		b=20;
		int sum = a+b;
		System.out.println("The Result of addition is ---> " + sum);


	}

	static void method1(double a, int b) 
	{
		a=10;
		b=20;
		double sub = a-b;
		System.out.println("The Result of subtraction is ---> " + sub);


	}

	static void method1(double a, double b) 
	{
		a=10;
		b=20;
		double mul = a*b;
		System.out.println("The Result of multiplication is ---> " + mul);


	}

	public static void main(String[] args) 
	{
		method1(0,0);
		method1(0.0,0);
		method1(0.0,0.0);
		
	}

}
