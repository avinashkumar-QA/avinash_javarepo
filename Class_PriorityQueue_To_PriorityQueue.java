package collection_java;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.PriorityQueue;

public class Class_PriorityQueue_To_PriorityQueue {

	public static void main(String[] args) {

		PriorityQueue pque1= new PriorityQueue();
		pque1.add(15);
		pque1.add(2);
		pque1.add(961);
		pque1.add(6);
		pque1.add(7);
		pque1.add(7);
		pque1.add(7);
		pque1.add(9);
		pque1.add(1);
		pque1.add(2);
		pque1.add(961);
		//pque1.add("Kavin");
		
		
		
		System.out.println("First Output: " + pque1);
		
		pque1.remove(15); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + pque1);
		
		pque1.remove(2); 
		System.out.println("After Deleted the value the output is (array pque1 is): " + pque1);
		
//		pque1.removeAll(pque1);
//		System.out.println("Removed all value from array pque1: " + pque1);
		
		PriorityQueue pque2= new PriorityQueue();
		pque2.add("Shyam");
		//pque2.addAll(pque1);
		System.out.println("Adding array value in pque2 and also showing the value which is still not removed from array v:" +pque2);
		
		boolean b1= pque2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array pque2: " + b1);
		
		boolean b2=pque2.containsAll(pque1);
		System.out.println("Value for pque1: " + pque1);
		System.out.println("Value for pque2: " + pque2);
		System.out.println(b2);
		
		boolean b3= pque2.equals(pque1);
		System.out.println("Checking pque2 value is equals to pque1: " + b3);
		
		boolean b4=pque2.isEmpty();
		System.out.println("Checking pque2 is empty or not: " + b4);
		
		PriorityQueue pque3= new PriorityQueue();
		pque3.add(500);
		pque3.add(100);
		pque3.add(50);
		pque3.add(900);
		pque3.add(700);
		pque3.add(500);
		
		
		//pque3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(pque3); //Sorting is not possible in PriorityQueue interface and it's all classes with any relation.
		//System.out.println("Sorting the value of pque3: " + pque3); 
		
		
		//PriorityQueue doesn't have ListIterator function so it won't support.
		
		Iterator i=pque3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		
		
		
		i.remove();
		System.out.println("Removing the value from array pque3" + i);
	
		
	
		
		
		

		
		
	}

}
