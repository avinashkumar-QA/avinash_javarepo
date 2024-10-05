package abstract_class;

abstract class Animal {

	abstract void sound();

}

class Dog extends Animal {
	
	
	 void sound()

	{
		System.out.println("Dog is barking");

	}
}

class Lion extends Animal {

	 void sound()

	{
		System.out.println("LION is Roar");

	}

}

abstract public class Abstract_Class_Animal 

{
	
	public static void main(String[] args) {
		
		
		
		Lion d=new Lion();
		d.sound();
		
		Dog d1=new Dog();
		d1.sound();

	}
}
