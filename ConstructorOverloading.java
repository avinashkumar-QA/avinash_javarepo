
public class ConstructorOverloading {

	ConstructorOverloading(int a, int b) {

		int sum = a + b;
		System.out.println(sum);
	}

	ConstructorOverloading(double a, double b) {

		double subs = a - b;
		System.out.println(subs);

	}

	ConstructorOverloading(boolean a, char v) {

		System.out.println("boolean and char has been passed");

	}

	public static void main(String[] args) {
		// we can call like this
		ConstructorOverloading co = new ConstructorOverloading(7, 8);

		{
			// Or Like this (but preferred this one)//
			new ConstructorOverloading(4, 5);
			new ConstructorOverloading(90, 7.0);
			new ConstructorOverloading(true, 'r');
		
	

		}

	}

}
