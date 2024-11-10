package revision;

import java.util.Arrays;

public class String_in_Char_ArrayForm {
	
	
	public static void main(String[] args) {
		
		
		String name= "Pooja Singh";
		String output="";
		
		char[] b1=name.toCharArray();
		
		System.out.println((Arrays.toString(b1)));
		
		for(int i=0; i<name.length(); i++) {
			
			
			char[] c= name.toCharArray();
			output=output+c[i];
			
			
		}
		
		System.out.println(output);
		
	}

}
