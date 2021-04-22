package CrrmFeeds;

import Base.Page;
import Pages.ZohoAppPage;

public class FeedsPage extends Page {
	
	
	
	public void post()
	{
		type("boxtype", "sumeet");
	
	}
	
	
	
	
	public  ZohoAppPage goToHomePage()
	{
		driverr.navigate().to(" https://home.zoho.in/home");
		return new ZohoAppPage();
	}

}
