import java.util.Scanner;

public class Scanner_AllMethods_Declare_Initialized {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Your Name");
		String name = sc.next(); 
		
		System.out.println("Are You Under 18");
		boolean bool=sc.nextBoolean();
		
		System.out.println("Please Enter Your Age");
		byte b = sc.nextByte();
	
		System.out.println("Please Enter Your Mob");
		long l = sc.nextLong();
		
		
		System.out.println("Please Enter Your Blood Range");
		double br = sc.nextDouble();
		sc.close();
	
	
		

	}

}
