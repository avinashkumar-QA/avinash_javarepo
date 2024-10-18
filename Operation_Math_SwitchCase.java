package keywords;

public class Operation_Math_SwitchCase {
 
	
	
	
	public static void main(String[] args) {

		int a = 40;
		int b = 20;
		
		switch (2) {

		case 1:

			int sum = a + b;

			System.out.println(sum);
			break;

		case 2:
			int sub = a - b;
			System.out.println(sub);
			break;
			
		case 3:

			int mul = a * b;
			System.out.println(mul);
			break;
			
		case 4:

			int div = a / b;
			System.out.println(div);
			break;

		case 5:

			int mod = a % b;
			System.out.println(mod);
			break;
			
		case 6:
			
			default:
			
			System.out.println("Please Enter correct input value in switch condition");

		}

	}

}
