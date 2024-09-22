import java.util.Scanner;

public class Area_Of_Triangle_ScannerClass {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the value of Base");

	int b = sc.nextInt();

	System.out.println("Enter the value of Height");

	double h = sc.nextDouble();

	double aot = 0.5 * b * h;
	System.out.println("Result of Triangle is ------>" + aot);
	sc.close();
	

}

}
