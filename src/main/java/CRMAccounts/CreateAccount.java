package CRMAccounts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;

import Base.Page;

public class CreateAccount  extends Page {
	
	String textrating="Market Failed";
	String expString;
	public void createAccount(String accountname,String acctittle)
	{
		//account name
		driverr.findElement(By.xpath("//*[@id=\"Crm_Accounts_ACCOUNTNAME\"]")).sendKeys(accountname);
		click("parentaccount");
	

		click("parentaccountvalue");
		
		//clikcing and filling value in industry type
		click("industry");
		type("industrytype", "Wireless Industry");
		findele("industrytype").sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		
		//verifying account revenue tittle popup
		click("accountrevenueclick");
		Assert.assertEquals(findele("accountrevenuetittle").getText(),acctittle);
		//rating select
		click("ratingclick");
		
		while(true) {
			
			findele("ratingclick").sendKeys(Keys.DOWN);
			
		 expString=	findele("ratingclick").getAttribute("aria-activedescendant");
			if(expString.contains(textrating))
			{
				findele("ratingclick").sendKeys(Keys.ENTER);
				break;
			}
			
		}
		
	

	}

}
