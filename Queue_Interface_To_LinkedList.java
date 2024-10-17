package collection_java;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class Queue_Interface_To_LinkedList {

	public static void main(String[] args) {

		Queue que1= new LinkedList();
		que1.add("Karan");
		que1.add("Karan");
		que1.add(9.6);
		que1.add("Avinash Kumar");
		que1.add(7);
		que1.add(null);
		que1.add(7);
		que1.add("");
		que1.add(null);
		

		
		
		
		System.out.println("First Output: " + que1);
		
		que1.remove(7); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted the value the Second Output: " + que1);
		
		que1.remove(null); 
		System.out.println("After Deleted  the output is (array que1 is): " + que1);
		
//		que1.removeAll(que1);
//		System.out.println("Removed all value from array que1: " + que1);
		
		Queue que2= new LinkedList();
		que2.add("Shyam");
		que2.addAll(que1);
		System.out.println("Adding array value in que2 and also showing the value which is still not removed from array v:" +que2);
		
		boolean b1= que2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array que2: " + b1);
		
		boolean b2=que2.containsAll(que1);
		System.out.println("Value for que1: " + que1);
		System.out.println("Value for que2: " + que2);
		System.out.println(b2);
		
		boolean b3= que2.equals(que1);
		System.out.println("Checking que2 value is equals to que1: " + b3);
		
		boolean b4=que2.isEmpty();
		System.out.println("Checking que2 is empty or not: " + b4);
		
		Queue que3= new LinkedList();
		que3.add(500);
		que3.add(100);
		que3.add(50);
		que3.add(900);
		que3.add(700);
	
		//que3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(que3); Sorting is not possible in queue interface and it's all classes with any relation.
		System.out.println("Sorting the value of que3: " + que3);
		
		
		//Queue doesn't have ListIterator function so it won't support.
		
		Iterator i=que3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		i.remove();
		System.out.println("Removing the value from array que3" + i);
	
		
	
		
	}

}
