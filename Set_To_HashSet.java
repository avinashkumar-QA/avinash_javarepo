package collection_java;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_To_HashSet {
	
	public static void main(String[] args) {
		

		Set set1= new HashSet();
		set1.add(15);
		set1.add(15);
		set1.add(15);
		set1.add(6);
		set1.add(17);
		set1.add(7);
		set1.add(7);
		set1.add(9);
		set1.add(1);
		set1.add(1);
		set1.add(961);
		set1.add("Rama");
		set1.add("Rama");
		set1.add(true);
		set1.add(1.78); //Heterogeneous allowed
		
		//set1.add(null); duplicate won't allow
		set1.add(null); // null allowed only 1 due to duplicate is not allowing.
		
		
		
		
		System.out.println("First Output: " + set1);
		
		set1.remove("Rama"); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + set1);
		
		set1.remove(0); 
		System.out.println("After Deleted the value the output is (array set1 is): " + set1);
		
//		set1.removeAll(set1);
//		System.out.println("Removed all value from array set1: " + set1);
		
		Set set2= new HashSet();
		set2.add("Rami Circle");
		//set2.addAll(set1);
		System.out.println("Adding array value in set2 and also showing the value which is still not removed from array v:" +set2);
		
		boolean b1= set2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array set2: " + b1);
		
		boolean b2=set2.containsAll(set1);
		System.out.println("Value for set1: " + set1);
		System.out.println("Value for set2: " + set2);
		System.out.println(b2);
		
		boolean b3= set2.equals(set1);
		System.out.println("Checking set2 value is equals to set1: " + b3);
		
		boolean b4=set2.isEmpty();
		System.out.println("Checking set2 is empty or not: " + b4);
		
		Set set3= new HashSet();
		set3.add(500);
		set3.add(100);
		set3.add(50);
		set3.add(900);
		set3.add(700);
		
		
		//set3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(set3); //Sorting is not possible in Set interface and it's all classes with any relation.
		//System.out.println("Sorting the value of set3: " + set3); 
		
		
		//Set doesn't have ListIterator function so it won't support.
		
		Iterator i=set3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		
		
		
		i.remove();
		System.out.println("Removing the value from array set3" + i);
	
		
	
		
		
	}

}
