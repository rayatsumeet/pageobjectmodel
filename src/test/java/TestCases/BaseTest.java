package TestCases;

import org.testng.annotations.AfterSuite;

import Base.Page;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown()
	{
		
	//	Page.quit();
	}

}
