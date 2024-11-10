package packageb;

public class NonRepeated_Char {

	public static void main(String[] args) {

		String inputstr= "ccchaar";

		for(char i: inputstr.toCharArray())
			
			
		if(inputstr.indexOf(i)==inputstr.lastIndexOf(i)) {


			System.out.println("The non-repeated characters are ---> " + i);
		}
	  }
	}
