package TypeCasting;

//Assignment no: 76
class Parent1 {

	void addition() {

		int a = 10;
		int b = 12;

		System.out.println(a + b);
	}

}

public class DowCasting extends Parent1 {

	void subtraction() {

		int a = 33;
		int b = 2;
		System.out.println(a - b);
	}

	public static void main(String[] args) {

		Parent1 p = new  DowCasting();
		p.addition(); // Upcasting

		DowCasting p2 = (DowCasting) p; // Downcasting
		p2.addition();
		p2.subtraction();

	}

}
