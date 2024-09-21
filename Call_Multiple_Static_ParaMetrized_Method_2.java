package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_Method_2 {

	static void add(int a, double b) 
	{
		System.out.println("The result of addition is --->  "  +  (a+b));
	}

	static void sub(int a, double b) 
	{
		System.out.println("The result of addition is ----> " + (a-b));
	}

	static void mul(int a, double b) 
	{
		System.out.println("The result of multiplication is --->  "  + (a*b));
	}

	static void div(int a, double b) 
	{
		System.out.println("The result of division is --->  "  + (a/b));
	}

	static void mod(int a, double b) 
	{
		System.out.println("The result of modulos is --->  "  + (a%b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		add(10,3.4);
		sub(4,3.0);
		mul(10,3.0);
		div(10,2.0);
		mod(8,4);

	}

}
