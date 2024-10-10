package array_concept;

import java.util.Arrays;

public class Two_Arrays_Equal {
	
	public static void main(String[] args) {
		
		int number1[]= new int[5];
			number1[0]=1;
			number1[1]=2;
			number1[2]=3;
			number1[3]=4;
			number1[4]=15;
			//number1[0]=1;
			
			int number2[]= new int[5];
			number2[0]=1;
			number2[1]=2;
			number2[2]=3;
			number2[3]=4;
			number2[4]=5;
			//number2[0]=1;
			
			
			
			if(Arrays.equals(number1, number2)) {

				System.out.println("Both Arrays values are same");
			}
			
			else
			{
				System.out.println("Both Arrays values are not same");
			}
		}
		
	}
	
