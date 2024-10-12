package array_concept;

public class Check_Value_Present_In_Array {

	public static void main(String[] args) {

		int number1[] = new int[5];
		number1[0]= 100;
		number1[1]=200;
		number1[2]=300;
		number1[3]=2100;
		number1[4]=500;

		int number2=2100;

		for(int i=0 ; i<number1.length; i++) {

			if(number2 ==number1[i]) {


			System.out.println(number2 + " is present in first array with the index position in " + i);

			}

		}
	}

}