package collection_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Class_ArrayList_To_ArrayList_Function {

	public static void main(String[] args) {

		
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(true);
		al.add(1.8);
		al.add("Avinash Kumar");
		al.add('k');
		al.add(null);
		al.add(1);
		al.add("");
		al.add(5, "Kameshawr");
		
		
		System.out.println("First Output: " + al);
		
		al.remove(1); // We can remove by using index or by value.
		System.out.println("After Deleted my index[1] the output is: " + al);
		
		al.remove(null); 
		System.out.println("After Deleted my index[6] the output is: " + al);
		
//		al.removeAll(al);
//		System.out.println("Removed all value from array al: " + al);
		
		ArrayList al2= new ArrayList();
		al2.add("Shyam");
		al2.addAll(al);
		System.out.println("Adding array value in al2 which is still not removed from array al:" +al2);
		
		boolean b1= al2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array al2: " + b1);
		
		boolean b2=al2.containsAll(al);
		System.out.println("Value for al: " + al);
		System.out.println("Value for al2: " + al2);
		System.out.println(b2);
		
		boolean b3= al2.equals(al);
		System.out.println("Checking al2 value is equals to al: " + b3);
		
		boolean b4=al2.isEmpty();
		System.out.println("Checking al2 is empty or not: " + b4);
		
		ArrayList al3= new ArrayList();
		al3.add(500);
		al3.add(100);
		al3.add(50);
		al3.add(900);
		al3.add(700);
	
		//al3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(al3);
		//System.out.println("Sorting the value of al3: " + al3);
		
		ListIterator i1= al3.listIterator();
		//System.out.println(i1); // This will give the memory address value to solve this we need to write the logic for while loop.
								  // // Return type of ListiIterator is "ListIterator".
		System.out.println("This is the Forward Result of Array");
		while(i1.hasNext()) //This is the forward method.
			
		{
			
			System.out.println(i1.next());
			
		}
		
		System.out.println("This is the Backward Result of Array"); // This will executed when the forward method is present.
		while(i1.hasPrevious()) 
		
		{
			System.out.println(i1.previous());
			
		}
		
		Iterator i2=al3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i2.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i2.next());
			
		}
		
		i2.remove();
		System.out.println("Removing the value from array al3" + i2);
	
		
		
		
	}

}
