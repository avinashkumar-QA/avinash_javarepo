package practice.javaprogram;

import java.util.Scanner;

public class Scanner_Static_Method_Arithmatic_Operation_MethodOverLoading {

	static int a,b,d;
	static double c;
	


	static void addition(int a, int b)
	{
		int sum=  a+b;
		System.out.println("The addition method is calling and the result is ----> "  + sum);
		System.out.println("\n");
	}


	static void addition(double c, int d)
	{
		double sub=  c-d;
		System.out.println("The subtraction method is calling and the result is ---->  "  + sub);
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Please Enter the Addition First value");
		a= sc.nextInt();


		System.out.println("Please Enter the Addition Second value");
		b= sc.nextInt();
		addition(a, b);
		
		System.out.println("Please Enter the First Subtraction value");
		c= sc.nextDouble();
		
		System.out.println("Please Enter the Second Subtraction value");
		d= sc.nextInt();
		addition(c,d);
		sc.close();

	}


}
