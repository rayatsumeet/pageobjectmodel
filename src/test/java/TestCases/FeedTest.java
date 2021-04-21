package TestCases;

import org.testng.annotations.Test;

import Base.Page;
import CrrmFeeds.FeedsPage;
import Pages.ZohoAppPage;

public class FeedTest {
	
	
	@Test
	public void feedTest()
	{
		
		ZohoAppPage zohoAppPage= new ZohoAppPage();
		
		zohoAppPage.goToCRM();
		FeedsPage feedsPage= Page.obMenu.goToFeeds();
		feedsPage.post();
	}

}
