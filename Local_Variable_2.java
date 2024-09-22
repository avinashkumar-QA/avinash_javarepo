package Variable;

public class Local_Variable_2 {
	
	
	void add() 
	{
		
		int a=10; // Local Variable
		int b= 20;
		int add= a+b;
		System.out.println("The addition result is --->  " + add);

	}

	void subtraction() 
	{
		
		int a=10; // Local Variable
		int b= 20;
		int sub= a-b;
		
		System.out.println("The subtraction result is --->  " +sub);

	}
	
	void mul(double a, double b) {
		
		a=10; //local variable
		b=30;
		double mul=a*b;
		System.out.println("The multiplication result is --->  " +mul); 

	}

	public static void main(String[] args) {
		
		Local_Variable_2 lv=new Local_Variable_2();
		lv.add();
		lv.subtraction();
		lv.mul(0, 0);
	

	}
	
	

	
}
