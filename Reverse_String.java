package string_reverse_concept;

public class Reverse_String {

		public static void main(String[] args) {

		String input = "ramji";
		String output ="";
		
		for (int i = 4; i>=0; i--) 
		{

			char c1 = input.charAt(i);

			System.out.println(c1);
			
			//or by this way using length string function we can write.
		
//			for(int i=input.length()-1 ; i>=0 ; i--) {
//				char c1 = input.charAt(i);
//				System.out.println(c1);
			}

		}
	}


