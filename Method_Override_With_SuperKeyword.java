package practice.javaprogram;

class Lion {

	void sound() {

	System.out.println("Lion in roaring");

	}
}

class Dog extends Lion{

	void sound() {
	super.sound();	
	System.out.println("Dog is barking");

	}
}

 	class Method_Override_With_SuperKeyword extends Dog {
	
	public static void main(String[] args) {
		
	Method_Override_With_SuperKeyword ob = new Method_Override_With_SuperKeyword();
	ob.sound();
		
	}

		

}
