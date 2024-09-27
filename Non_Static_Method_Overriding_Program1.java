package method.overriding;

class Fackebook_email extends Fackebook_pass {

	void Facebook() {
		System.out.println("Facebook Email");
		

	}

}

class Fackebook_pass {

	void Facebook() {

		System.out.println("Facebook Password");

	}
}

public class Non_Static_Method_Overriding_Program1 {

	public static void main(String[] args) {

		Fackebook_email ob = new Fackebook_email();
		ob.Facebook();

	}

}
