
public class Constructor_Static {

	// As Manish said constructor always be non-static but Inside the app Quiz it's both static and non static and able to run the program. so need to confirm.
	static void Constructor_Static() {

		System.out.println("Static Constructor calling");

	}


	Constructor_Static(String i) 
	{

		System.out.println("Non Static Contructor Calling" + i);	

	}


	public static void main(String[] args) {

		Constructor_Static();
		Constructor_Static c=new Constructor_Static(" ");




	}

}
