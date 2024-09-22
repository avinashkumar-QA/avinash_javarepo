import java.util.Scanner;

public class Area_Of_Square_ScannerClass {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value of Side");

			double side = sc.nextDouble();

			double aos = side * side;
			System.out.println("Result of Area Square is -----> " + aos);
		}

	}

}
