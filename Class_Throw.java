package throwsandthrows;
import java.io.IOException;
import java.lang.NullPointerException;
public class Class_Throw {
	
	void addition() throws IOException {
		
		throw new IOException();
	}
	
	public static void main(String[] args)throws NullPointerException,IOException {
		
//		int a= 1;
//		int b= 0;
//		
//		System.out.println(a/b);
	//	throw new IOException();
		//throw new IOException("The cell is empty");
		
		if( 1>=1) {
		throw new NullPointerException();
	}
		
		else {
			
			throw new IOException();
		}

}
}