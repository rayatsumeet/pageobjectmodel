package ActivitiesPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base.Page;
import Pages.ZohoAppPage;
import Utilities.BrokenLinks;

public class Activitiesmainpage extends Page{
	
	
	
	public void fetchAlldata()
	{
	
	List<WebElement>listofalldataList= driverr.findElements(By.xpath(or.getProperty("fetchalldatainActivity")));	
	
	for(WebElement alldata:listofalldataList)
	{
		System.out.println(alldata.getText());
	}
		
	}
	
	public void setMeeting()
	{
		
	}
	
	public AllClassPage goToAllCalls()
	{
		
		
		return new AllClassPage();
	}
	
	public void getUrl()
	{
	String urlString=	driverr.getCurrentUrl();
	BrokenLinks.getBrokenLinks(urlString);
	}
	
	public  ZohoAppPage goToHomePage()
	{
		driverr.navigate().to("  https://home.zoho.in/home");
		return new ZohoAppPage();
	}

}
