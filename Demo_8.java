package dicol.java;

public class Demo_8 {
	
	public static void main(String[] args) {
		
		int num1=1;
		int num2=0;
		int num3=1;
		
	for(int i=0; i<=10; i++) {
		num1=num2;
		num2=num3;
		num3= num1+num2;
		
		System.out.print(num3+ " ");
	}
		
		
	}

}
