package array_concept;

import java.util.Arrays;
import java.util.Scanner;

public class Accept_Value_Runtime {

	public static void main(String[] args) {

		int arraysize[] = new int[5];
		System.out.println("Please Enter the Value at Runtime");
		Scanner sc = new Scanner(System.in);

		//for (int i = 0; i <= 4; i++) { // we can write as like.
		
		for(int i=0; i<arraysize.length; i++) { //or we can write as like.

			arraysize[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(arraysize));
		sc.close();
	}

}
