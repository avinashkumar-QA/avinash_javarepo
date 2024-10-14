package java_string;

import java.util.Date;

public class Current_Date_AndTime {

	public static void main(String[] args) {

		Date d1 = new Date();
		System.out.println(d1);

		String d2 = d1.toString();
		System.out.println(d2.substring(4, 7));

		String d3 = d2.substring(24, 28);
		System.out.println(d3);

		String d4 = d1.toString();
		System.out.println(d4.substring(8, 10));

		
		
		 
	}

}
