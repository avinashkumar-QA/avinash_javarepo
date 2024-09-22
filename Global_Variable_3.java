package Variable;

public class Global_Variable_3 {

	
	static int i=10;
	static int j=20;

	void addition()
	{

		int add= i+j;
		System.out.println("The result of addition is ----> "  +   add);
	}


	void subtraction() 
	{
	
		int sub= i-j; 
		System.out.println("The result of subtraction is ----> "  +   sub);

	}


	void multiplication()
	{
		int mul= i*j;
		System.out.println("The result of multiplication is  ----> "  + mul);

	}


	static void division()
	{

		int div= i/j;
		System.out.println("The result of division is  ----> "  + div);

	}


	static void modulos()
	{
		int mod= i%j;
		System.out.println("The result of modulos is ----> "   +   mod);

	}

	public static void main(String[] args) {

		Global_Variable_3 gk= new Global_Variable_3();

		gk.addition();
		gk.subtraction();
		gk.multiplication();
		division();
		modulos();


	}


}
