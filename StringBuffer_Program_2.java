package StringBuffer;

public class StringBuffer_Program_2 {
	
	public static void main(String[] args) {
		
		StringBuffer b1= new StringBuffer("Avinash");
		System.out.println(b1);
		
		b1.append("Gullu Singh");
		System.out.println(b1);
		
		int c=b1.capacity();
		System.out.println(c);
		
		char c1=b1.charAt(2);
		System.out.println(c1);
		
		//System.out.println(b1.delete(0, 2));
		
		b1.insert(2, 't');
		System.out.println(b1);
		
		b1.setCharAt(5, 'L');
		System.out.println(b1);
		
		
		
		b1.toString();
		System.out.println(b1);
			
			
		}
		
	}

