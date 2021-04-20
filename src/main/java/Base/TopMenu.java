package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CRMAccounts.Accountspage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void goToHome()
	{
		
	}
	
	public void goToLeads()
	{
		
	}
	
	public void goToContacts()
	{
		
	}
	
	public Accountspage goToAccounts()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Accounts']")).click();
		return new Accountspage();
	}
	public void goToDeals()
	{
		
	}
	
	public void goToSognout()
	{
		
	}


}
