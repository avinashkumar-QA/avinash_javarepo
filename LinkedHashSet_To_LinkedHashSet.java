package collection_java;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_To_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet LinkedHashSet1= new LinkedHashSet();
		LinkedHashSet1.add(15);
		LinkedHashSet1.add(125);
		LinkedHashSet1.add(135);
		LinkedHashSet1.add(6);
		LinkedHashSet1.add(17);
		LinkedHashSet1.add(7);
		LinkedHashSet1.add(7);
		LinkedHashSet1.add(9);
		LinkedHashSet1.add(1);
		LinkedHashSet1.add(1);
		LinkedHashSet1.add(961);
		LinkedHashSet1.add("Shalini");
		LinkedHashSet1.add("Dharma");
		LinkedHashSet1.add(true);
		LinkedHashSet1.add(1.78); //Heterogeneous allowed
		
		LinkedHashSet1.add(null); //duplicate won't allow
		LinkedHashSet1.add(null); // null allowed only 1 due to duplicate is not allowing.
		
		
		
		System.out.println("First Output: " + LinkedHashSet1);
		
		LinkedHashSet1.remove("Rama"); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + LinkedHashSet1);
		
		LinkedHashSet1.remove(0); 
		System.out.println("After Deleted the value the output is (array LinkedHashSet1 is): " + LinkedHashSet1);
		
//		LinkedHashSet1.removeAll(LinkedHashSet1);
//		System.out.println("Removed all value from array LinkedHashSet1: " + LinkedHashSet1);
		
		LinkedHashSet LinkedHashSet2= new LinkedHashSet();
		LinkedHashSet2.add("Rami Circle");
		//LinkedHashSet2.addAll(LinkedHashSet1);
		System.out.println("Adding array value in LinkedHashSet2 and also showing the value which is still not removed from array v:" +LinkedHashSet2);
		
		boolean b1= LinkedHashSet2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array LinkedHashSet2: " + b1);
		
		boolean b2=LinkedHashSet2.containsAll(LinkedHashSet1);
		System.out.println("Value for LinkedHashSet1: " + LinkedHashSet1);
		System.out.println("Value for LinkedHashSet2: " + LinkedHashSet2);
		System.out.println(b2);
		
		boolean b3= LinkedHashSet2.equals(LinkedHashSet1);
		System.out.println("Checking LinkedHashSet2 value is equals to LinkedHashSet1: " + b3);
		
		boolean b4=LinkedHashSet2.isEmpty();
		System.out.println("Checking LinkedHashSet2 is empty or not: " + b4);
		
		LinkedHashSet LinkedHashSet3= new LinkedHashSet();
		LinkedHashSet3.add(500);
		LinkedHashSet3.add(100);
		LinkedHashSet3.add(50);
		LinkedHashSet3.add(900);
		LinkedHashSet3.add(700);
		LinkedHashSet3.add(1700);
		LinkedHashSet3.add(27200);
		//LinkedHashSet3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(LinkedHashSet3); //Sorting is not possible in LinkedHashSet interface and it's all classes with any relation.
		//System.out.println("Sorting the value of LinkedHashSet3: " + LinkedHashSet3); 
		
		
		//LinkedHashSet doesn't have ListIterator function so it won't support.
		
		Iterator i=LinkedHashSet3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println("Removing the value from array set3" + i);

		
	}

}
