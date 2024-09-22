package Variable;

public class Global_Variable_1 {

	static int p = 10; // Global variable
	int j = 19; // Doubt As Manish said we can distinguish the global variable in static and non static but the non static variable i am trying to print in main method it's throwing compilation error.

	static int pi;

	public static void main(String[] args) {

		int i = 2; // Local Variable
		int k = 7;
		int add = i + k;
		System.out.println("The result of addition for local variable is-----> " + add);

		int a; // Local variable
		a = 10;
		int b;
		b = 20;
		int sub = a + b;
		System.out.println("The result of subtraction for local variable is-----> " + sub);


		System.out.println(i + p);
		System.out.println(pi);
		System.out.println(pi2);

	}

	static int pi2;



}
