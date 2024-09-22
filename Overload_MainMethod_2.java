
public class Overload_MainMethod_2 {

	public static void main(String[] args) {

		System.out.println("This is a heart of main method");
		main("Ram");
		Overload_MainMethod_2 oc=new Overload_MainMethod_2();
		oc.main('C', true);

	}

	public static void main(String name) {

		System.out.println("String");

	}

	public void main(char a, boolean b) {

		System.out.println("char and boolean ");
	}
}
