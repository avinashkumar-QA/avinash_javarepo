package testng_package;

import org.testng.annotations.Test;

/*We can't depend on the order of execution 
as alphabetically we can set our own priority.*/

public class ExecutionOrder_Multiple_Test {
	
	@Test
	public void Login()
	{
		
	}
	
	@Test
	public void logout()
	{
		
	}
	
	@Test
	public void Registration()
	{
		
	}
	
	@Test
	public void Amazon_popup()
	{
		
	}

}
