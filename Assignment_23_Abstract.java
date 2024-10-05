package abstract_class_injava;


class SuperMost{   
	
		void add(int a, int b)  // supermost class having 1st concrete method
		{
	
		int sum= a+b;
		
		System.out.println("The addition of two value is ---> "  + sum);
		}
		
		void sub(int a, int b) // supermost class having 2nd concrete method
		{
			
		int sub= a-b;
		
		System.out.println("The subtraction of two value is ---> "  + sub);
	
		}
}
		
abstract class Abstract_Method extends SuperMost {
	
	void modulos(int a, int b)  // abstract class having 1st concrete method
	{
		
		int mod= a%b;
		System.out.println("The modulos of two value is ---> "  + mod);

		
	}
	
	void add_mul(int a, int b, int c)  // abstract class having 2nd concrete method
	{
		
		int add_mul= a+b*c;
		System.out.println("The subtraction of two value is ---> "  + add_mul);

	}
	
	abstract void multiplication(int a, int b); // abstract class having 1st abstract method
	abstract void division(int a, int b); // abstract class having 2nd abstract method
	

  }


public class Assignment_23_Abstract extends Abstract_Method  {

	void multiplication(int a, int b) //child class having 1st concrete method
	{
		int mul=a*b;
		System.out.println("The multiplcation of two value is ---> "  + mul);

	}

	void division(int a, int b)  //child class having 2nd concrete method
	{
		int div=a/b;
		System.out.println("The divisdion of two value is ---> "  + div);
	}
	
	public static void main(String[] args) {
		
		Assignment_23_Abstract ob= new Assignment_23_Abstract();
		ob.add(1, 2);
		ob.sub(5, 4);
		ob.modulos(10, 5);
		ob.add_mul(5, 7, 3);
		ob.multiplication(6, 8);
		ob.division(8, 3);
		
		}
	}

