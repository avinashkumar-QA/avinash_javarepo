package collection_java;

import java.util.Iterator;
import java.util.ArrayDeque;

public class Class_ArrayDeque_To_ArrayDeque {

	public static void main(String[] args) {
		
		
		ArrayDeque aque1= new ArrayDeque();
		aque1.add(15);
		aque1.add(2);
		aque1.add(961);
		aque1.add(6);
		aque1.add(7);
		aque1.add(7);
		aque1.add(7);
		aque1.add(9);
		aque1.add(1);
		aque1.add(2);
		aque1.add(961);
		aque1.add("Ram");
		aque1.add(true);
		aque1.add(1.78);
		//aque1.add(null);
		
		
		
		System.out.println("First Output: " + aque1);
		
		aque1.remove("Ram"); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + aque1);
		
		aque1.remove(2); 
		System.out.println("After Deleted the value the output is (array aque1 is): " + aque1);
		
//		aque1.removeAll(aque1);
//		System.out.println("Removed all value from array aque1: " + aque1);
		
		ArrayDeque aque2= new ArrayDeque();
		aque2.add("Shyam");
		//aque2.addAll(aque1);
		System.out.println("Adding array value in aque2 and also showing the value which is still not removed from array v:" +aque2);
		
		boolean b1= aque2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array aque2: " + b1);
		
		boolean b2=aque2.containsAll(aque1);
		System.out.println("Value for aque1: " + aque1);
		System.out.println("Value for aque2: " + aque2);
		System.out.println(b2);
		
		boolean b3= aque2.equals(aque1);
		System.out.println("Checking aque2 value is equals to aque1: " + b3);
		
		boolean b4=aque2.isEmpty();
		System.out.println("Checking aque2 is empty or not: " + b4);
		
		ArrayDeque aque3= new ArrayDeque();
		aque3.add(500);
		aque3.add(100);
		aque3.add(50);
		aque3.add(900);
		aque3.add(700);
		aque3.add(500);
		
		
		//aque3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(aque3); //Sorting is not possible in ArrayDeque interface and it's all classes with any relation.
		//System.out.println("Sorting the value of aque3: " + aque3); 
		
		
		//ArrayDeque doesn't have ListIterator function so it won't support.
		
		Iterator i=aque3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		
		
		i.remove();
		System.out.println("Removing the value from array aque3" + i);
	
		
	
		
		

	}

}
