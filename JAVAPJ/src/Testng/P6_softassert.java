package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class P6_softassert 

{ 
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	WebDriver driver;
	
	@Test
	public void start1()
	{
		SoftAssert s1=new SoftAssert();
		Reporter.log("start1 starts", true);
		driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		s1.assertEquals("Google","Booooooogle");
		Reporter.log("start1 ends",true);
		s1.assertAll();  //if u do nt put this command it shows both test has been passed
	}
	
	@Test
	public void test1()
	{
		Reporter.log("test1 starts",true);
		Reporter.log("test1 ends",true);

	}
	
}
