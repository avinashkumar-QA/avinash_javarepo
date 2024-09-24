package inheritance;

class ClassD {

	static void coconut() {
		System.out.println("This is coconut tree, which is super most class ");

	}

}

class ClassC extends ClassD {

	void wallnut() {
		System.out.println("This is wallnut tree, which is super class ");

	}

}

class ClassB extends ClassC {

	static void almond() {
		System.out.println("This is Almond tree, which is super class ");

	}

}

public class Multilevel_ClassA_StaticNonStatic extends ClassB {

	void olive() {
		System.out.println("This is olive tree, which is sub class ");

	}

	public static void main(String[] args) {

		Multilevel_ClassA_StaticNonStatic ob = new Multilevel_ClassA_StaticNonStatic();

		ob.olive();
		almond();
		ob.wallnut();
		coconut();

	}

}
