package TestCases;

import org.testng.annotations.Test;

import ActivitiesPages.Activitiesmainpage;
import Base.Page;
import Pages.ZohoAppPage;

public class ActivitiesTest {
	
	
	@Test
	public void activitiesMainPageCheck()
	{
		ZohoAppPage zohoAppPage= new ZohoAppPage();
		
		zohoAppPage.goToCRM();
		Page.obMenu.goToActivities();
		Activitiesmainpage mainobActivitiesmainpage = new Activitiesmainpage();
		mainobActivitiesmainpage.fetchAlldata();
		mainobActivitiesmainpage.getUrl();
		
	}

}
