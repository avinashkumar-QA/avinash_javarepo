package packageb;

import java.util.Arrays;

public class MergeArray {


	public static void main(String[] args) {

		int array1[] = new int[3];
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;

		int array2[] = new int[3];
		array2[0]=40;
		array2[1]=50;
		array2[2]=60;

		int array3[] = new int[array1.length+ array2.length];

		for(int i=0; i<array1.length; i++) {

			array3[i]= array1[i];


		}

		//System.out.println(Arrays.toString(array3));
		
		for(int j=0; j<array2.length; j++) {

			array3[j + array1.length]= array2[j];


		}

		System.out.println(Arrays.toString(array3));


	}

	

}
