package collection_java;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeSet;

public class TreeSet_To_TreeSet {

	public static void main(String[] args) {

		TreeSet TreeSet1= new TreeSet();
		TreeSet1.add(15);
		TreeSet1.add(125);
		TreeSet1.add(135);
		TreeSet1.add(6);
		TreeSet1.add(17);
		TreeSet1.add(7);
		TreeSet1.add(7);
		TreeSet1.add(9);
		TreeSet1.add(1);
		TreeSet1.add(1);
		TreeSet1.add(1961);
		TreeSet1.add(2961);
		TreeSet1.add(3961);
		TreeSet1.add(4961);
		TreeSet1.add(5961);
		TreeSet1.add(6961);
		TreeSet1.add(7961);
		TreeSet1.add(8961);
		TreeSet1.add(9961);
		//TreeSet1.add(true);
	//	TreeSet1.add(1.78); //Heterogeneous allowed
		
		//TreeSet1.add(null); //duplicate won't allow
		//TreeSet1.add(null); // null allowed only 1 due to duplicate is not allowing.
	
		
		
		System.out.println("First Output: " + TreeSet1);
		
		TreeSet1.remove(7); // We can remove by entering the value not index value. but it will deleted unique and duplicate but in case of duplicate any one can remove..
		System.out.println("After Deleted value the Second Output: " + TreeSet1);
		
		TreeSet1.remove(0); 
		System.out.println("After Deleted the value the output is (array TreeSet1 is): " + TreeSet1);
		
//		TreeSet1.removeAll(TreeSet1);
//		System.out.println("Removed all value from array TreeSet1: " + TreeSet1);
		
		TreeSet TreeSet2= new TreeSet();
		TreeSet2.add(78);
		//TreeSet2.addAll(TreeSet1);
		System.out.println("Adding array value in TreeSet2 and also showing the value which is still not removed from array v:" +TreeSet2);
		
		boolean b1= TreeSet2.contains(8); // Check all words not a single word present or not.
		System.out.println("Conatins is present in array TreeSet2: " + b1);
		
		boolean b2=TreeSet2.containsAll(TreeSet1);
		System.out.println("Value for TreeSet1: " + TreeSet1);
		System.out.println("Value for TreeSet2: " + TreeSet2);
		System.out.println(b2);
		
		boolean b3= TreeSet2.equals(TreeSet1);
		System.out.println("Checking TreeSet2 value is equals to TreeSet1: " + b3);
		
		boolean b4=TreeSet2.isEmpty();
		System.out.println("Checking TreeSet2 is empty or not: " + b4);
		
		TreeSet TreeSet3= new TreeSet();
		TreeSet3.add(500);
		TreeSet3.add(100);
		TreeSet3.add(50);
		TreeSet3.add(900);
		TreeSet3.add(700);
		TreeSet3.add(1700);
		TreeSet3.add(27200); 
		//TreeSet3.add("Srama"); //Heterogeneous not allowed.
		
		//TreeSet3.add("Ram"); For sorting only it will accepted homogeneous value.
		
		//Collections.sort(TreeSet3); //Sorting is not possible in TreeSet interface and it's all classes with any relation.
		//System.out.println("Sorting the value of TreeSet3: " + TreeSet3); 
		
		
		//TreeSet doesn't have ListIterator function so it won't support.
		
		TreeSet TreeSet4= new TreeSet();
		
		//TreeSet4.add(null); Not accepting null.
		TreeSet4.add("Karma");
		System.out.println(TreeSet4);
		
		Iterator i=TreeSet3.iterator(); // Iterator doesn't have hasPrevious method
									// Return type of iterator is "iterator".
		System.out.println("Iterator");
		while(i.hasNext()) {   //hasNext Return type is boolean.
			
			System.out.println(i.next());
		}
		
		i.remove();
		System.out.println("Removing the value from array TreeSet3" + i);

		
		
	}

}
