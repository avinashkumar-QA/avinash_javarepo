package collection_java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Collection_Interface_Properties {

	
	public static void main(String[] args) {
		
		Collection c1= new ArrayList();
		c1.add(5);
		c1.add("Avinash Kumar");
		c1.add(173);
		c1.add(1.80);
		c1.add(null); //collection can store the null value.
		c1.add(5);
		c1.add(true);
		c1.add('c');
		
		
		
		System.out.println(c1);
		
		
		Collection c2= new ArrayList();
		
		c2.addAll(c1);
		c2.add("Akash");
		System.out.println(c2);
		
		boolean b2=c1.equals(c2);
		System.out.println(b2);
		
		boolean b3=c1.contains("Kumar"); //In collection this will check  all the sentences words is present or not. 
		System.out.println(b3);
		
		boolean b4= c1.containsAll(c2);
		System.out.println(b4);
		
		//c1.clear();
//		c2.clear();
		//System.out.println(c1);
//		System.out.println(c2);
		
		boolean b6=c1.isEmpty(); //this will check if the value is empty or not.
		System.out.println("Check---" + b6);
		
		boolean b7=c1.remove("Avinash Kumar");
		System.out.println(c1);
		System.out.println(b7);
		
		
		boolean b8= c2.removeAll(c1);
		System.out.println("The new value is ---> " + c2);
		System.out.println(b8);
		
		
		
		
		
		
//		String s= "Avinash Rajan";
//		boolean b5=s.contains("Rajan"); //this will check if any one contains are matching or not.
//		System.out.println(b5);
		
		
		
		
//		int input[]= new int[2];  //Array can't store the null value it's give an exception null pointer.
//		input[0]= (Integer) null;
//		input[0]= 10;
//		input[1]= 10;
//		System.out.println(input[0]);
//		System.out.println(input[1]);
		
	
		
		
	}

}
