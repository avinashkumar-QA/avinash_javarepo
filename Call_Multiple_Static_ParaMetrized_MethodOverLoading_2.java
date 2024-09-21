package practice.javaprogram;

public class Call_Multiple_Static_ParaMetrized_MethodOverLoading_2 {


	static void operators_check(boolean a) {

		System.out.println("The Result Of boolean is ---> " + a);

	}

	static void operators_check(int a, int b) {

		System.out.println("The Result Of Addition is ---> " + (a+b));

	}

	static void operators_check(double a, int c) {

		System.out.println("The Result Of multiplication is ---> " + a*c);

	}


	public static void main(String[] args) {

		//operators_check(false);
		Call_Multiple_Static_ParaMetrized_MethodOverLoading_2.operators_check(false);
		operators_check(5,4);
		operators_check(10.0,7);
		
		

	}

}
