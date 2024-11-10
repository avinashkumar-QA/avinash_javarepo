package javaexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java_Exception_Try_Catch {

	public static void main(String[] args) {

		try {
			System.out.println("Please Enter the Input");
			Scanner sc = new Scanner(System.in);
			sc.nextInt();
			int Arrays[] = new int[2];
			Arrays[0] = 10;
			Arrays[1] = 20;
			Arrays[2] = 30;

			for (int i = 0; i <Arrays.length; i++) {

				//String b= Arrays.toString();
				System.out.println(Arrays[i]);

			}
		} catch (ArrayIndexOutOfBoundsException a) {

			System.out.println("Array Index Exception Gets Handled");
		}

		catch (InputMismatchException a1) {

			System.out.println("InputMissEx Handeled");

		}

	}

}
