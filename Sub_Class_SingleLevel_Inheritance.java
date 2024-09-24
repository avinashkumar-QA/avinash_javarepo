package inheritance;

public class Sub_Class_SingleLevel_Inheritance extends Parent_Class_SingleLevel_Inheritance  {

	static void addition(int a, int b) {

		int add = a + b;

		System.out.println("The addition is ----> " + add);

	}

	public static void main(String[] args) {
		
		addition(55,77);
		subtraction(100,75);

	}
	
	

}
