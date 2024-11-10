package keywords;

import java.util.Scanner;

public class Vowel_Scanner {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the Vowel char");
		
		Scanner sc= new Scanner(System.in);
	  
        char c= sc.next().charAt(0);
		
		if(c=='a' || c == 'e' || c=='i' || c=='o' || c=='u')	
			
		System.out.println(c +  " ----> is a vowel ");
		
		
		else {
			
			
		System.out.println(c + " ----> is a constant ");
	
		
		  
		  
		  }

	}

}
