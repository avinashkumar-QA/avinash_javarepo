import java.util.Scanner;

public class Addition_ScannerClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the First Value");
		int a = sc.nextInt();

		System.out.println("Please Enter the Second Value");
		int b = sc.nextInt();

		int sum = a + b;
		System.out.println("Addition Result ------>" + sum);
		sc.close();

	}

}
