import java.util.Scanner;

public class Area_Of_Reactangle_ScannerClass {
	
	public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the value of Length");

	double l = sc.nextDouble();

	System.out.println("Enter the value of Width");

	double w = sc.nextDouble();

	double aor = l* w;
	System.out.println("Resule of Circumtances of Circle is ------>" + aor);
	sc.close();

}

}
