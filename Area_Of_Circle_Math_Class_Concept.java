package mathpackage;

import java.util.Scanner;

public class Area_Of_Circle_Math_Class_Concept {

	static double radius;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Radius Value");
		radius = sc.nextDouble();

		double areaofcircle = Math.PI * radius * radius;
		System.out.println("The area of circle is  --->  " + areaofcircle);
		sc.close();

	}

}
