package practice.javaprogram;

import java.util.Scanner;

public class Scanner_Static_Method_Arithmatic_Operation_1 {


	static void add(int a, int b) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the First value");
		int value1=sc.nextInt();

		System.out.println("Please Second the First value");
		int value2=sc.nextInt();

		int sum= value1+value2;
		System.out.println("The Addition Result of value1 and value2 is ----> "  + sum );
		


	}


	static void sub(double a, int b) 
	{

		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the First value");
		double value1=sc.nextDouble();

		System.out.println("Please Second the First value");
		int value2=sc.nextInt();

		double subtraction= value1-value2;
		System.out.println("The Subtraction Result of value1 and value2 is ----> "  + subtraction );
		sc.close();


	}

	public static void main(String[] args) {

		add(0,0);
		sub(0.0,0);
		

	}

}
