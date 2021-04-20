package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.Page;
import CRMAccounts.Accountspage;
import CRMAccounts.CreateAccount;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ZohoAppPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		HomePage obHomePage = new HomePage();
	LoginPage loginPage=	obHomePage.goToLogin();
	ZohoAppPage zohoAppPage =	loginPage.doLogin("sumeetrayat9@gmail.com","Sonu@1991");
		zohoAppPage.goToCRM();
		Accountspage accountspage	=Page.obMenu.goToAccounts();
		
	
		
		CreateAccount createAccount=accountspage.goToCreateAccountPage();
		
//	createAccount.createAccount();
	}

}
