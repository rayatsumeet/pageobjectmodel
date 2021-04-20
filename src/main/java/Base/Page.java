package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page {
	
	
	public static WebDriver driverr;
	public static TopMenu obMenu ;
	public static Properties config = new Properties();
	public static Properties or = new Properties();
	public static FileInputStream fis;
	public static WebDriverWait wait;
	public static Actions actions;
	
	 
	public static Logger log  = Logger.getLogger("Page");
	public Page() 
	{
		if(driverr==null) {
			
			PropertyConfigurator.configure("log4j.properties");
			
				log.info("started");
				try {
				fis= 	new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties");
					config.load(fis);
					
			fis= 		new FileInputStream(System.getProperty("user.dir")+"\\properties\\or.properties");
					or.load(fis);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(config.getProperty("browser").equals("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--disable-notifications");
					options.addArguments("--disable-infobar");
					driverr = new ChromeDriver(options);

				}
				else {
					WebDriverManager.firefoxdriver().setup();
					driverr= new FirefoxDriver();
				}
			
			
	
		driverr.get(config.getProperty("testsiteurl"));
		driverr.manage().window().maximize();
		driverr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		obMenu= new TopMenu(driverr) ;
		wait = new WebDriverWait(driverr, 5);
	}

}
	
	public static void quit()
	{
		driverr.quit();
	}
	public static boolean presence(By by)
	{
		try {
			driverr.findElement(by);
			return true;
		} catch ( Throwable e) {
	
			return false;
		}
	}
	
	public void click(String locator) {
		
		driverr.findElement(By.xpath(or.getProperty(locator))).click();

	}
	
	public void type(String locator, String value)
	{
		driverr.findElement(By.xpath(or.getProperty(locator))).sendKeys(value);
		
	}
	static WebElement dropElement;
	public void select(String locator,String value)
	{
		dropElement= driverr.findElement(By.xpath(or.getProperty(locator)));
		Select obSelect = new Select(dropElement);
		obSelect.selectByValue(value);
		
		
	}
	
	public void Move(String locator)
	{
		actions = new Actions(driverr);
		actions.moveToElement((WebElement)By.xpath(or.getProperty(locator))).perform();
	}
	
	public static void verifyEquals(String a,String b) throws IOException {
		// TODO Auto-generated method stub
		try {
			Assert.assertEquals(a, b);
		}
		catch(Exception e)
		{
			Utilities.screenshotAShot.screenshot();
		}
	}
	
	public  WebElement findele(String loc)
	{
	WebElement element= 	driverr.findElement(By.xpath(or.getProperty(loc)));
		
	return element;
	}
}
