package revision;

public class Words_Reverse {

	public static void main(String[] args) {

		String name = "Jai Maa Sherawali";
		String output="";
		String[] word = name.split(" ");

		for (String w : word) {

			String reverseword = "";

			for (int i = w.length() - 1; i >= 0; i--) {

				reverseword = reverseword + w.charAt(i);
					
			}
			
			output=output+reverseword+ " ";

		}
		
		System.out.println(output);


	}

}
