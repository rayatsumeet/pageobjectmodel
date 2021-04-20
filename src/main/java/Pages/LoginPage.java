package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;

public class LoginPage extends Page{
	
	
	public ZohoAppPage doLogin(String username,String password)
	{
		type("username", username);
		//clik on next page
		click("clicknext");
		type("password", password);
		//cliking on sign in page
		
		click("clicksignin");
		
		return  new ZohoAppPage();
		
		
	}

}
