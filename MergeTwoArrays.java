package packageb;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {


		int a[]	= new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;

		int b[]	= new int[3];
		b[0]=4;
		b[1]=5;
		b[2]=6;

		int c[]	= new int[6];

		for(int i=0; i<a.length; i++) {

			c[i]= a[i];

			System.out.println(c[i]);
		}

		for(int i=0; i<b.length; i++) {

			c[i]= b[i];
		}
		

		System.out.println(Arrays.toString(c));
	}

}
