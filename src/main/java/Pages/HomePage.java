package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;

public class HomePage extends Page {
	public void goToSignUp()
	{
		
	}

	public LoginPage goToLogin()
	{
		click("sign_in");
		return new LoginPage();
	}
	
	public void goToSupport()
	{
		
	}
	 
	public void goToEnglishHover()
	{
		
	}
	
	public void validateFotterLinks()
	{
		
	}

}
