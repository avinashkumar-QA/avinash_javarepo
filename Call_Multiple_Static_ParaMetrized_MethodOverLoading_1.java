package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_MethodOverLoading_1 {

	static void arithmetic_operation() 
	{

		System.out.println("First arithmetic_operation called  ");

	}

	static void arithmetic_operation(int i, int j)
	{

		System.out.println("Second arithmetic_operation called");
	}

	static void arithmetic_operation(double i, double j)
	{
		System.out.println("Third arithmetic_operation called");

	}

	static void arithmetic_operation(int i, double j)
	{
		System.out.println("Fourth arithmetic_operation called");

	}

	static void arithmetic_operation(double i, int j)
	{
		System.out.println("Fivth arithmetic_operation called");


	}



	public static void main(String[] args) {

		arithmetic_operation();
		arithmetic_operation(0,0);
		arithmetic_operation(0.0,0.0);
		arithmetic_operation(0,0.0);
		arithmetic_operation(0.0,0);



	}

}
