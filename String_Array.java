package java_string;

import java.util.Arrays;

public class String_Array {
	
	static String name= "Avinash Kumar Singh";

	public static void main(String[] args) {
		
		
			//First way to print the the string in Array by using toCharArray();
			char c[]=name.toCharArray();
		
			System.out.println(Arrays.toString(c)); // [A, V, I... like that]
		
			//Second way to print the the string in Array by using toCharArray();
			for(int i=0; i<name.length() ; i++) {
			
			char c1[]=name.toCharArray();
			System.out.println(c1[i]); // Print in Parallel one one char.
			
		}
			//Third way to print the the string in Array by using toCharAt();
			for(int j=0; j<name.length();j++ ) {
				
						char p=name.charAt(j);
						
						System.out.println(p); // Print in Parallel one one char.
				
			}
		
	}

}
