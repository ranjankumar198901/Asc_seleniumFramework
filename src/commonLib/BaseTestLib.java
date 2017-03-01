package commonLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestLib implements BasepageLib
{
	public WebDriver driver;
	@BeforeMethod
	public void precondition()
	{
		System.setProperty(chromekey, chromePath);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.google.co.in");
	}
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
}
