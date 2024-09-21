package practice.javaprogram;

import java.util.Scanner;

public class Scanner_AreaOfCirlce {


	static double  pi;
	static double radius;

	static void areaofCircle() 
	{

		double aof= pi*radius*radius;

		System.out.println("The Area of Circle value is ----> " + aof);

	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter the Value of PI");
		pi=sc.nextDouble();

		System.out.println("Please Enter the Value of Radius");
		radius=sc.nextDouble();
		areaofCircle();
		sc.close();





	}










}
