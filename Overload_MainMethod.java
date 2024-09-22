
public class Overload_MainMethod {

	public static void main(String[] args) {

		System.out.println("This is a heart of main method");
		main();
		main(5, 6.2);
		main(18.2, 4);
		main(8, 4);
		main(9.0, 7.0);
		
		Overload_MainMethod om= new Overload_MainMethod();
		om.main("Avinash", 'a');
		
		

	}

	public static void main() {

		System.out.println("Method Overloaded Non-Parametrized");

	}

	public static void main(int i, double b) {
		double add = i + b;
		System.out.println("Result of addition ---> " + add);
	}

	public static void main(double a, int b) {
		double sub = a - b;
		System.out.println("Result of subtraction ---> " + sub);
	}

	public static void main(int a, int b) {
		int mul = a * b;
		System.out.println("Result of multiplication ---> " + mul);
	}

	public static void main(double a, double b) {
		double div = a / b;
		System.out.println("Result of division ---> " + div);
	}

	 void main(String a, char b) {

		System.out.println("Result of String and Char");
	}

}
