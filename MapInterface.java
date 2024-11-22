package collection_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {

		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Id", 1);
		m1.put("Salary", 2000);
		m1.put("Account Number", 123);
		m1.put("Pin", 212);
		m1.put("Age", 30);
		m1.put("Ifsc", 1232);

		System.out.println(m1);

		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("con", 2);
		
		m2.putAll(m1);

		m2.putAll(m1);
		System.out.println(m2);

		boolean b1 = m1.isEmpty();
		System.out.println(b1);

		m1.replace("Salary", 400);
		System.out.println(m1);

		m1.replace("Account Number", 123, 8700);
		System.out.println(m1);
		

		System.out.println(m1.keySet());
		System.out.println(m1.values());
		System.out.println(m1.entrySet());

		for (String s2 : m1.keySet()) {
			System.out.println(s2);
		}

		
		for (Integer s4 : m1.values()) {
			System.out.println(s4);
		}

		for (Entry<String, Integer> s5 : m1.entrySet()) {

			System.out.println(s5);
		}
		
		
		Iterator <Entry <String, Integer>> s6= m1.entrySet().iterator();
			
			while(s6.hasNext()) {
				
				System.out.println(s6.next());
		}
			
			m1.clear();
			System.out.println(m1);
			
			System.out.println(m1.equals(m2));
			
			System.out.println("Removing");
			System.out.println(m2.remove(m1));

	}

}
