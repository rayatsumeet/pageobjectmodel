package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.Page;
import CrmPages.CRmHomePage;

public class ZohoAppPage extends Page {
	

	
	
	public CRmHomePage goToCRM()
	{
		
		driverr.findElement(By.xpath("//span[@class='_logo-crm _logo-x96 zod-app-logo']")).click();
		return new CRmHomePage();
	}
	
	public void goToBooks()
	{
		
		
	}
	public void goToMail()
	{
		
		
	}
	
	public void goToDesk()
	{
		
		
	}


}
