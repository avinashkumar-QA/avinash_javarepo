package abstract_class_injava;

abstract class Gmail {

	abstract void gmail_signup(); // this is abstract method

	 abstract void gmail_login(); //// this is abstract method
}

public class Techify extends Gmail {

	void gmail_signup() { //this is concrete method

		System.out.println("Gmail Signup has been successfully");

	}

	void gmail_login() { //this is concrete method

		System.out.println("Gmail login has been successfully");

	}

	public static void main(String[] args) {

		Techify ob = new Techify();
		ob.gmail_signup();
		ob.gmail_login();

	}

}
