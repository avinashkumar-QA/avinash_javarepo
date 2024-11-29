package testng_package;

import org.testng.annotations.Test;

/*We can't depend on the order of execution 
as alphabetically we can set our own priority.*/

/*Note: The default priority of any test is Zero*/

public class PriorityWise_ExecutionOrder_Multiple_Test {
	
	@Test(priority=-1)
	public void Login()
	{
		
	}
	
	@Test(priority=-2)
	public void logout()
	{
		
	}
	
	@Test(priority=2)
	public void Registration()
	{
		
	}
	
	@Test(priority=3)
	public void Amazon_popup()
	{
		
	}

}