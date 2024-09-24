package inheritance;

class Coconut1 {

	void coconut() {
		System.out.println("This is coconut tree, which is super most class ");

	}

}

class Waallnut extends Coconut1 {

	void wallnut() {
		System.out.println("This is wallnut tree, which is super class ");

	}

}

class Almond1 extends Waallnut {

	void almond() {
		System.out.println("This is Almond tree, which is super class ");

	}

}

public class ClassTree_Multilevel_NonStatic_Program extends Almond1 {

	void olive() {
		System.out.println("This is olive tree, which is sub class ");

	}

	public static void main(String[] args) {

		ClassTree_Multilevel_NonStatic_Program ob = new ClassTree_Multilevel_NonStatic_Program();

		ob.olive();
		ob.almond();
		ob.wallnut();
		ob.coconut();

	}

}
