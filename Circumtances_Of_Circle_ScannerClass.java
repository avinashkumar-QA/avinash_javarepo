import java.util.Scanner;

public class Circumtances_Of_Circle_ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of PI");

		double pi = sc.nextDouble();

		System.out.println("Enter the value of Radius");

		double r = sc.nextDouble();

		double coc = 2 * pi * r;
		System.out.println("Result of Circumtances of Circle is ------>" + coc);
		sc.close();

	}

}
