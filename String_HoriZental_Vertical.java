package packageb;

import java.util.Arrays;

public class String_HoriZental_Vertical {
	
	public static void main(String[] args) {
		
		String name= "Avinash";
		
		for(int i=0; i<name.length(); i++) {
		
				char c=	name.charAt(i);
					
				System.out.println(c);	
		
		}
		
		char [] c1= name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		
	}
	
}
