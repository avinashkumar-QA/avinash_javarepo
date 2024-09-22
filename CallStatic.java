
public class CallStatic {

	static void method1() {
		System.out.println("Infosys");
	}

	static void method2() {
		System.out.println("TCS");
	}

	static void method3() {
		System.out.println("IBM");
	}

	static void method4() {
		System.out.println("SAP LAB");
	}

	static void method5() {
		System.out.println("Collabera");
	}

	public static void main(String[] args) {

		System.out.println("GrowTechMinds");
		method1();
		method2();
		method3();
		method4();
		method5();

		// here we can create an object for a class object with it's reference variable.but the warning will come,
		// so the best way to call the static method which are out side the main method but in a class so call the static method in a main method by it's method name.

	}

}
