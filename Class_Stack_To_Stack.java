package collection_java;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Class_Stack_To_Stack {
	
	
	public static void main(String[] args) {
		
		Stack stc1= new Stack();
		stc1.add("Ronit");
		stc1.add("Karan");
		stc1.add(9.6);
		stc1.add("Avinash Kumar");
		stc1.add(1);
		stc1.add(null);
		stc1.add(1);
		stc1.add("");
		
		
		System.out.println("First Output: " + stc1);
		
		stc1.remove(1); // We can remove by using index or can mention the value.
		System.out.println("After Deleted index [1] Second Output: " + stc1);
		
		stc1.remove(null); 
		System.out.println("After Deleted my index[6] the output is (array stc1 is): " + stc1);
		
//		stc1.removeAll(stc1);
//		System.out.println("Removed all value from array stc1: " + stc1);
		
		Stack stc2= new Stack();
		stc2.add("Shyam");
		stc2.addAll(stc1);
		System.out.println("Adding array value in stc2 and also showing the value which is still not removed from array v:" +stc2);
		
		boolean b1= stc2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array stc2: " + b1);
		
		boolean b2=stc2.containsAll(stc1);
		System.out.println("Value for stc1: " + stc1);
		System.out.println("Value for stc2: " + stc2);
		System.out.println(b2);
		
		boolean b3= stc2.equals(stc1);
		System.out.println("Checking stc2 value is equals to stc1: " + b3);
		
		boolean b4=stc2.isEmpty();
		System.out.println("Checking stc2 is empty or not: " + b4);
		
		Stack stc3= new Stack();
		stc3.add(500);
		stc3.add(100);
		stc3.add(50);
		stc3.add(900);
		stc3.add(9700);
	
	
		//stc3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		Collections.sort(stc3);
		System.out.println("Sorting the value of stc3: " + stc3);
		
		ListIterator li= stc3.listIterator();
		//System.out.println(li); // This will give the memory address value to solve this we need to write the logic for while loop.
								  // // Return type of ListiIterator is "ListIterator".
		System.out.println("This is the Forward Result of Array");
		while(li.hasNext()) //This is the forward method.
			
		{
			
			System.out.println(li.next());
			
		}
		
		System.out.println("This is the Backward Result of Array"); // This will executed when the forward method is present.
		while(li.hasPrevious()) 
		
		{
			System.out.println(li.previous());
			
		}
		
		Iterator i=stc3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		i.remove();
		System.out.println("Removing the value from array stc3" + i);
	
		
		
		
		
	}

}
