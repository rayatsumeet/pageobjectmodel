package CRMAccounts;

import org.openqa.selenium.By;

import Base.Page;

public class Accountspage  extends Page{
	
	public CreateAccount goToCreateAccountPage()
	{
		driverr.findElement(By.xpath("//*[@id=\"table_row_1\"]/lyte-td[3]/span[1]/link-to/button")).click();
		return new CreateAccount();
		
	}
	
	public void goToImportAccounts()
	{
		
		
	}

}
