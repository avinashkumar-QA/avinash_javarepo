package Variable;

public class Update_Value_ForGlobalVariable {
	
	
	static String name;
	int a= 10;  //not static global variable
	//name = "kabir"; we can't update the global value in globally so call into in local always. 
	

	public static void main(String[] args) {
		
		name= "ram";
		System.out.println("The result for String is ----> "   + name );
		
		Update_Value_ForGlobalVariable ns= new Update_Value_ForGlobalVariable(); //calling class object ref variable to print the non static global value.
		
		ns.a=11;
		System.out.println(ns.a);
		
		
		

	}

}
