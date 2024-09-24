package inheritance;

class Coconut 
{

	static void coconut() 
	{
		System.out.println("This is coconut tree, which is super most class ");

	}

}

class Wallnut extends Coconut {

	static void wallnut() 
	{
		System.out.println("This is wallnut tree, which is super class ");

	}

}

class Almond extends Wallnut 
{

	static void almond() 
	{
		System.out.println("This is Almond tree, which is super class ");

	}

}

public class ClassTree_Multilevel_Static_Program extends Almond {

	static void olive() 
	{
		System.out.println("This is olive tree, which is sub class ");

	}

	public static void main(String[] args) 
	{

		olive();
		almond();
		wallnut();
		coconut();

	}

}
