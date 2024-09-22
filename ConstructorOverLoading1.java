public class ConstructorOverLoading1 {

	ConstructorOverLoading1() {

		System.out.println("This is my 1st constructor called");
	}

	ConstructorOverLoading1(int a) {

		System.out.println("This is my 2nd constructor called");
	}

	ConstructorOverLoading1(char a) {

		System.out.println("This is my 3rd constructor called");
	}

	ConstructorOverLoading1(String a) {

		System.out.println("This is my 4th constructor called");
	}

	ConstructorOverLoading1(int a, String b) {

		System.out.println("This is my 5th constructor called");
	}

	ConstructorOverLoading1(String b, int a) {

		System.out.println("This is my 6th constructor called");
	}

	public static void main(String[] args) {

		/*
		 * ConstructorOverLoading1 co1=new ConstructorOverLoading1();
		 * ConstructorOverLoading1 co2=new ConstructorOverLoading1(3);
		 * ConstructorOverLoading1 co3=new ConstructorOverLoading1('R');
		 * ConstructorOverLoading1 co4=new ConstructorOverLoading1("Ram");
		 * ConstructorOverLoading1 co5=new ConstructorOverLoading1(3, "Aman");
		 * ConstructorOverLoading1 co6=new ConstructorOverLoading1("Arjun", 13);
		 */

		// OR

		new ConstructorOverLoading1();
		new ConstructorOverLoading1(3);
		new ConstructorOverLoading1('R');
		new ConstructorOverLoading1("Ram");
		new ConstructorOverLoading1(3, "Aman");
		new ConstructorOverLoading1("Arjun", 13);

	}
}