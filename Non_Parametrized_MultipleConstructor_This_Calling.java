package constructor.thiscalling;

public class Non_Parametrized_MultipleConstructor_This_Calling {

		Non_Parametrized_MultipleConstructor_This_Calling() {
		this(1);
		System.out.println("constructor-1");

	}

		Non_Parametrized_MultipleConstructor_This_Calling(int i) {
		this(1,2);
		System.out.println("constructor-2");

	}

		Non_Parametrized_MultipleConstructor_This_Calling(int i, int b) {
		this(1,2,3);
		System.out.println("constructor-3");

	}

		Non_Parametrized_MultipleConstructor_This_Calling(int i, int b, int c) {

		System.out.println("constructor-4");

	}

		public static void main(String[] args) {

		new Non_Parametrized_MultipleConstructor_This_Calling();

	}

}
