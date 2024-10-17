package collection_java;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Class_LinkedList_To_LinkedList {
	
	public static void main(String[] args) {
		
		LinkedList ll1= new LinkedList();
		ll1.add("Roshan");
		ll1.add(5);
		ll1.add(9.6);
		ll1.add("Avinash Kumar");
		ll1.add('k');
		ll1.add(null);
		ll1.add(5);
		ll1.add("");
		ll1.add(7, "p");
		
		
		System.out.println("First Output: " + ll1);
		
		ll1.remove(1); // We can remove by using index or can mention the value.
		System.out.println("After Deleted index [1] the Second Output: " + ll1);
		
		ll1.remove(null); 
		System.out.println("After Deleted my index[6] the output is (array ll1 is): " + ll1);
		
//		ll1.removeAll(ll1);
//		System.out.println("Removed all value from array ll1: " + ll1);
		
		LinkedList ll2= new LinkedList();
		ll2.add("Shyam");
		ll2.addAll(ll1);
		System.out.println("Adding array value in ll2 and also showing the value which is still not removed from array v:" +ll2);
		
		boolean b1= ll2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array ll2: " + b1);
		
		boolean b2=ll2.containsAll(ll1);
		System.out.println("Value for ll1: " + ll1);
		System.out.println("Value for ll2: " + ll2);
		System.out.println(b2);
		
		boolean b3= ll2.equals(ll1);
		System.out.println("Checking ll2 value is equals to ll1: " + b3);
		
		boolean b4=ll2.isEmpty();
		System.out.println("Checking ll2 is empty or not: " + b4);
		
		LinkedList ll3= new LinkedList();
		ll3.add(500);
		ll3.add(100);
		ll3.add(50);
		ll3.add(900);
		ll3.add(700);
	
		//ll3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(ll3);
		//System.out.println("Sorting the value of ll3: " + ll3);
		
		ListIterator li= ll3.listIterator();
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
		
		Iterator i=ll3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		i.remove();
		System.out.println("Removing the value from array ll3" + i);
	
		
		
		
		
	}

}
