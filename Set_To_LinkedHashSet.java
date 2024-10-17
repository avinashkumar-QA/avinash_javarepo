package collection_java;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_To_LinkedHashSet {

	public static void main(String[] args) {

		Set Set1= new LinkedHashSet();
		Set1.add(15);
		Set1.add(125);
		Set1.add(135);
		Set1.add(6);
		Set1.add(17);
		Set1.add(7);
		Set1.add(7);
		Set1.add(9);
		Set1.add(1);
		Set1.add(1);
		Set1.add(961);
		Set1.add("Dharma");
		Set1.add("Dharma");
		Set1.add(true);
		Set1.add(1.78); //Heterogeneous allowed
		
		Set1.add(null); //duplicate won't allow
		Set1.add(null); // null allowed only 1 due to duplicate is not allowing.
		
		
		
		
		System.out.println("First Output: " + Set1);
		
		Set1.remove("Rama"); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + Set1);
		
		Set1.remove(0); 
		System.out.println("After Deleted the value the output is (array Set1 is): " + Set1);
		
//		Set1.removeAll(Set1);
//		System.out.println("Removed all value from array Set1: " + Set1);
		
		Set Set2= new LinkedHashSet();
		Set2.add("Rami Circle");
		//Set2.addAll(Set1);
		System.out.println("Adding array value in Set2 and also showing the value which is still not removed from array v:" +Set2);
		
		boolean b1= Set2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array Set2: " + b1);
		
		boolean b2=Set2.containsAll(Set1);
		System.out.println("Value for Set1: " + Set1);
		System.out.println("Value for Set2: " + Set2);
		System.out.println(b2);
		
		boolean b3= Set2.equals(Set1);
		System.out.println("Checking Set2 value is equals to Set1: " + b3);
		
		boolean b4=Set2.isEmpty();
		System.out.println("Checking Set2 is empty or not: " + b4);
		
		Set Set3= new LinkedHashSet();
		Set3.add(500);
		Set3.add(100);
		Set3.add(50);
		Set3.add(900);
		Set3.add(700);
		Set3.add(1700);
		Set3.add(27200);
		//Set3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(Set3); //Sorting is not possible in Set interface and it's all classes with any relation.
		//System.out.println("Sorting the value of Set3: " + Set3); 
		
		
		//Set doesn't have ListIterator function so it won't support.
		
		Iterator i=Set3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println("Removing the value from array set3" + i);
	}

}
