package collection_java;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Class_Vector_To_Vector {
	
			public static void main(String[] args) {

			
			Vector v= new Vector();
			v.add(true);
			v.add(1);
			v.add(1.8);
			v.add("Avinash Kumar");
			v.add('k');
			v.add(null);
			v.add(1);
			v.add("");
			v.add(5, "9");
			
			
			System.out.println("First Output: " + v);
			
			v.remove(1); // We can remove by using index or can mention the value.
			System.out.println("After Deleted my index[1] the output is: " + v);
			
			v.remove(null); 
			System.out.println("After Deleted my index[6] the output is: " + v);
			
//			v.removeAll(v);
//			System.out.println("Removed all value from array v: " + v);
			
			Vector v2= new Vector();
			v2.add("Shyam");
			v2.addAll(v);
			System.out.println("Adding array value in v2 which is still not removed from array v:" +v2);
			
			boolean b1= v2.contains("Avinash Kumar"); // Check all words not a single word present or not.
			System.out.println("Conatins is present in array v2: " + b1);
			
			boolean b2=v2.containsAll(v);
			System.out.println("Value for v: " + v);
			System.out.println("Value for v2: " + v2);
			System.out.println(b2);
			
			boolean b3= v2.equals(v);
			System.out.println("Checking v2 value is equals to v: " + b3);
			
			boolean b4=v2.isEmpty();
			System.out.println("Checking v2 is empty or not: " + b4);
			
			Vector v3= new Vector();
			v3.add(500);
			v3.add(100);
			v3.add(50);
			v3.add(900);
			v3.add(700);
		
			//v3.add("Ram"); For sorting only it will accepted homogeneous value.
			
			//Collections.sort(v3);
			//System.out.println("Sorting the value of v3: " + v3);
			
			ListIterator li= v3.listIterator();
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
			
			Iterator i2=v3.iterator(); // Iterator doesn't have hasPrevious method
										// Return type of iterator is "iterator".
			System.out.println("Iterator");
			while(i2.hasNext()) {   //hasNext Return type is boolean.
				
				System.out.println(i2.next());
				
			}

			i2.remove();
			System.out.println("Removing the value from array v3" + i2);
		
			
			
			
		}

	}

