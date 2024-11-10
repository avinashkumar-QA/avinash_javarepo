package StringBuffer;

public class StringBuffer_Program_1 {
	
	public static void main(String[] args) {
		
		
		String name1="Avinash";
		name1.concat("Kumar"); //Immutable bz can't change the string value;
		System.out.println(name1);
		String name2= "Avinash";
		
		
		boolean b=name1.equals(name2);
		System.out.println(b);
		
		if(name1==name2) {
			
			System.out.println("truuuu");
		}
		
		else {
			System.out.println("fff");
			
		}
		
		
		StringBuffer sb2= new StringBuffer("Ramji");
		sb2.append("Ayodhya Wale"); //mutable bz we can modify the value;
		System.out.println(sb2);
		
		
		//System.out.println(sb2.reverse());
	}

}
