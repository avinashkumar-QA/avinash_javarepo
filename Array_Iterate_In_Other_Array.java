package array_concept;

import java.util.Arrays;

public class Array_Iterate_In_Other_Array {

	public static void main(String[] args) {
		
	int array1[]= new int[4];
		array1[0]= 1;
		array1[1]= 2;
		array1[2]= 3;
		array1[3]= 4;
		
	int array2[]= new int[4];
	
	for(int i=0; i<array1.length;i++) {
		
		array2[i] = array1[i];
	}
	
	System.out.println(Arrays.toString(array1));
	System.out.println(Arrays.toString(array2));
	

	}

}
