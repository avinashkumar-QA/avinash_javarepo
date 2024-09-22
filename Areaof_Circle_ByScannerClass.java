import java.util.Scanner;

public class Areaof_Circle_ByScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of PI");

		double pi = sc.nextDouble();

		System.out.println("Enter the value of Radius");

		double r = sc.nextDouble();

		double aoc = pi * r * r;
		System.out.println("The valie of Area of Circle is ----->" + aoc);
		sc.close();

	}

}
