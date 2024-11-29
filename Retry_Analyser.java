package failed_testcasestestng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//this can be done by using the interface "iRetryAnalyzer"//


//Steps: to invoke "IRetryAnalyzer"

/* 1. create a class and implements IRetryAnalyzer
* 2. override it's method from IRetryAnalyzer interface
* 3. write your own logic to retry the test cases  or how many times to retry.
* 4. create a test cases and make it consume the retrylogic class which you 
*    have created in step 1.
*    
*    Question: How to run the failed test cases using xml file?
* 
*/

public class Retry_Analyser implements IRetryAnalyzer{
	
	int initialCount = 0;
	int IRetryAnalyzercount = 1;
	@Override
	public boolean retry(ITestResult result) {

		if (initialCount < IRetryAnalyzercount) {

			initialCount++;
			return true;

		}

		return false;
	}


}
