package TestCases;

import org.testng.annotations.Test;

import Base.Page;
import CRMAccounts.Accountspage;
import CRMAccounts.CreateAccount;
import Pages.ZohoAppPage;
import Utilities.Data;

public class CreateAccountTest {
	
	@Test(dataProviderClass = Data.class,dataProvider = "getData")
	public void createTest(String accountname,String acctittle)
	{
		ZohoAppPage zohoAppPage= new ZohoAppPage();
		zohoAppPage.goToCRM();
		Accountspage accountspage	=Page.obMenu.goToAccounts();
		
        CreateAccount account=      accountspage.goToCreateAccountPage();
           
          account.createAccount(accountname,acctittle);
	}

}
