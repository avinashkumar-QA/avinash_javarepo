package inheritance;

class Reporting {

	Reporting() {
		
		System.out.println("Reporting");

	}

}

class Screenshot extends Reporting {

	Screenshot(int i) {
		
		System.out.println("Screenshot");

	}
}

public class TestCase_SuperCallingStatement extends Screenshot {

	TestCase_SuperCallingStatement() {
		super(10);
		System.out.println("TestCase");
	}

	public static void main(String[] args) {

		new TestCase_SuperCallingStatement(); // Note: Constructor can't be inheritated in java.
		
	}

}
