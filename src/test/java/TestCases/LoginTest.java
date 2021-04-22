package TestCases;

import javax.swing.text.Utilities;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ZohoAppPage;
import Utilities.Data;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass = Data.class,dataProvider = "getData" )
	public void loginTest(String username ,String password,String runmode)
	{
		HomePage obHomePage = new HomePage();
		LoginPage loginPage=	obHomePage.goToLogin();
		loginPage.doLogin(username,password);	
		
	}

}
