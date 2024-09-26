package inheritance;

class Senior_Java_Devloper {

	Senior_Java_Devloper(int i) {

		System.out.println("Senior_Java_Devloper");
	}
}

class Technical_Lead extends Senior_Java_Devloper {

	Technical_Lead(String a, int c) {
		super(20);
		System.out.println("Technical_Lead");
	}
}

public class SuperCalling_Parameterised_with_Multiple_Class_Constructor extends Technical_Lead {

	SuperCalling_Parameterised_with_Multiple_Class_Constructor(double a, double b) {
		super("Avinash", 10);
		System.out.println("Technical Manager");

	}

	public static void main(String[] args) {

		new SuperCalling_Parameterised_with_Multiple_Class_Constructor(1.0, 2.0);
	}

}
