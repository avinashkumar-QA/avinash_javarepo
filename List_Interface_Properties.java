package collection_java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class List_Interface_Properties {

	public static void main(String[] args) {

		List ob= new ArrayList();
		ob.add(210);
		ob.add(90);
		ob.add(290);
		ob.add(10);
		ob.add(900);
		ob.add(800);
		ob.add("Ram");  //List interface always sorted the homogeneous value not heterogeneous.
		ob.add(1.9);
		ob.add(null);
		ob.add(800);
		System.out.println("Before Sorting--> " + ob);
		//Collections.sort(ob);
		//System.out.println("After sorting---> " + ob);
		
		ArrayList al= new ArrayList();
		
		
		Iterator i= ob.iterator();
		
		while(i.hasNext()) {
			
		System.out.println(i.next());
		
		

			
		}
		
		
		
	}

}
