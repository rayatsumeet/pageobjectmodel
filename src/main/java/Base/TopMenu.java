package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CRMAccounts.Accountspage;
import CrrmFeeds.FeedsPage;

public class TopMenu {
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void goToHome()
	{
		
	}
	
	public void goToActivities()
	{
		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[6]/a")).click();
	}
	
	public void goToContacts()
	{
		
	}
	public FeedsPage goToFeeds()
	{
		
		driver.findElement(By.xpath("//*[@id=\"mainMenuTabDiv\"]/crm-menu/div[1]/crm-tab/div[2]/div[8]/a")).click();
		return new FeedsPage();
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
