package practice.javaprogram;

import java.util.Scanner;

public class Scanner_Static_Method_Arithmatic_Operation_2 {

	static int a;
	static int b;


	static void addition()
	{
		int sum=  a+b;
		System.out.println("The addition method is calling and the result is ---->  "  + sum);
	}
	
	static void subtraction()
	{
		int sub=  a-b;
		System.out.println("The subtraction method is calling and the result is ---->  "  + sub);
	}

	public static void main(String[] args) {

	Scanner sc= new Scanner(System.in);
	
	System.out.println("Please Enter the Addition First value");
	a= sc.nextInt();
	
	System.out.println("Please Enter the Addition Second value");
	b= sc.nextInt();
	addition(); 
	
	System.out.println("Please Enter the Subtraction First value");
	a= sc.nextInt();
	
	System.out.println("Please Enter the Subtraction Second value");
	b= sc.nextInt();
	subtraction();
	
	sc.close();

	}


}
