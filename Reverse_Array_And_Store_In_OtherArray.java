package array_concept;

import java.util.Arrays;

public class Reverse_Array_And_Store_In_OtherArray {

	public static void main(String[] args) {

		int arrayfirst[] = new int[4];
		arrayfirst[0] = 10;
		arrayfirst[1] = 20;
		arrayfirst[2] = 30;
		arrayfirst[3] = 40;

		int arraysecond[] = new int[4];

		for (int i = 0, k = 3; i < arrayfirst.length; i++, k--) {

			arraysecond[k] = arrayfirst[i];

		}

		System.out.println(Arrays.toString(arrayfirst));
		System.out.println(Arrays.toString(arraysecond));

	}

}
