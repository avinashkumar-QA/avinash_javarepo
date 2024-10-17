package collection_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.HashSet;

public class HashSet_To_HashSet {

	public static void main(String[] args) {

		HashSet HashSet1= new HashSet();
		HashSet1.add(15);
		HashSet1.add(15);
		HashSet1.add(15);
		HashSet1.add(6);
		HashSet1.add(17);
		HashSet1.add(7);
		HashSet1.add(7);
		HashSet1.add(9);
		HashSet1.add(1);
		HashSet1.add(1);
		HashSet1.add(961);
		HashSet1.add("Kama");
		HashSet1.add("Verma");
		HashSet1.add(true);
		HashSet1.add(1.78); //Heterogeneous allowed
		
		//HashSet1.add(null); duplicate won't allow
		HashSet1.add(null); // null allowed only 1 due to duplicate is not allowing.
		
		
		
		
		System.out.println("First Output: " + HashSet1);
		
		HashSet1.remove("Rama"); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + HashSet1);
		
		HashSet1.remove(0); 
		System.out.println("After Deleted the value the output is (array HashSet1 is): " + HashSet1);
		
//		HashSet1.removeAll(HashSet1);
//		System.out.println("Removed all value from array HashSet1: " + HashSet1);
		
		HashSet HashSet2= new HashSet();
		HashSet2.add("Rami Circle");
		//HashSet2.addAll(HashSet1);
		System.out.println("Adding array value in HashSet2 and also showing the value which is still not removed from array v:" +HashSet2);
		
		boolean b1= HashSet2.contains("Avinash Kumar"); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array HashSet2: " + b1);
		
		boolean b2=HashSet2.containsAll(HashSet1);
		System.out.println("Value for HashSet1: " + HashSet1);
		System.out.println("Value for HashSet2: " + HashSet2);
		System.out.println(b2);
		
		boolean b3= HashSet2.equals(HashSet1);
		System.out.println("Checking HashSet2 value is equals to HashSet1: " + b3);
		
		boolean b4=HashSet2.isEmpty();
		System.out.println("Checking HashSet2 is empty or not: " + b4);
		
		HashSet HashSet3= new HashSet();
		HashSet3.add(500);
		HashSet3.add(100);
		HashSet3.add(50);
		HashSet3.add(900);
		HashSet3.add(700);
		HashSet3.add(1700);
		HashSet3.add(7200);
		//HashSet3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(HashSet3); //Sorting is not possible in HashSet interface and it's all classes with any relation.
		//System.out.println("Sorting the value of HashSet3: " + HashSet3); 
		
		
		//HashSet doesn't have ListIterator function so it won't support.
		
		Iterator i=HashSet3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
			
		}
		
		i.remove();
		System.out.println("Removing the value from array set3" + i);
		
		
	}

}
