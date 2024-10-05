package java_interface;

interface Facebook{
	
	 void facebook_signup();
	 void facebook_login();
}

interface Instagram{
	
	 void Instagram_signup();
	 void Instagram_login();
}


public class Interface_Program_1 implements Instagram , Facebook{

	public void facebook_signup() 
	{
		System.out.println("Facebook signup successfully");
	}

	public void facebook_login()
	{
		System.out.println("Facebook login successfully");
	}

	public void Instagram_signup()
	{
		System.out.println("Instagram signup successfully");
	}

	public void Instagram_login()
	{
		System.out.println("Instagram login successfully");
	}
	
	public static void main(String[] args) {
		
		Interface_Program_1 ob= new Interface_Program_1();
		ob.facebook_signup();
		ob.facebook_login();
		ob.Instagram_signup();
		ob.Instagram_login();
		
	}

}
