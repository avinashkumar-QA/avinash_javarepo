package java_string;

public class String_Function_Replace_Match_Programs {
	
	public static void main(String[] args) {
		
		//Assignment 37: In the given string match both are equal sentence or not.
		String 	name1= "Avinash";
		boolean b1= name1.equalsIgnoreCase("avinash"); 
		System.out.println(b1);
		
		
		//Assignment 38: In the given string replace the K with T.
		String name2="Kv no 2";
		String b2=name2.replace('K', 'T');
		System.out.println(b2);
		
		//Assignment 39: In the given string word replace the Bihar to Delhi.
		String name3="I am in Bihar";
		String b3=name3.replace("Bihar", "Delhi");
		System.out.println(b3);
		
		//Assignment 40: In the given string input replace the 2 with Nothing.
		String name4="I am in Sector 3";
		String b4=name4.replace("3", "");
		System.out.println(b4);
		
		//Assignment 41: In the given string input replace all the alphabets with Nothing.
		String name5="a am in sector 3";
		String b5=name5.replaceAll("[a-z]" , "");
		System.out.println(b5);
		
		//Assignment 42: In the given string input replace all the Capital letters with Nothing.
		String name6="I Am In Sector 3";
		String b6=name6.replaceAll("[A-Z]" , "");
		System.out.println(b6);	
		
		//Assignment 43: In the given string input replace all the entire numerics with Nothing.
		String name7="I Am In Sector 37";
		String b7=name7.replaceAll("[0-7]" , "");
		System.out.println(b7);
		
		
		//Assignment 44: Check in the given string as adject letters in it or not. 
		String name8="My name is Avinash 44";
		boolean b8=name8.matches(".....................");
		System.out.println(b8);
		
		
		//Assignment 45: Check in the given string is start with M or not. . 
		String name9="My name is Avinash";
		boolean b9=name9.matches("M(.*)");
		System.out.println(b9);
		
		//Assignment 46: Check in the given string is end with M or not. . 
		String name10="My name is Avinash";
		boolean b10=name10.matches("(.*)h");
		System.out.println(b10);		
		
		//Assignment 47: Check in the given string s is present or not. . 
		String name11="My name is Avinash";
		boolean b11=name11.matches("(.*)s(.*)");
		System.out.println(b11);	
		
		
		//Assignment 48: Replace space in the given string with the underscore. 
		String name12="My name is Avinash";
		String b12=name12.replace(" ", "_");
		System.out.println(b12);
			
		

		
		
	}
	
	
	
	
}


