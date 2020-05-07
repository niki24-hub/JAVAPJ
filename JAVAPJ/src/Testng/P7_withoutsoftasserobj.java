package Testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class P7_withoutsoftasserobj 

{
		static
		{
			System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		}

		WebDriver driver;
		
		@Test
		public void start1()
		{
			//SoftAssert s1=new SoftAssert();
			Reporter.log("start1 starts", true);
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			Assert.assertEquals("Google","Booooooogle");
			Reporter.log("start1 ends",true); ///this line will not be executed since test in "assert" is faild
			//s1.assertAll();
		}
		
		
		@Test
		public void test1()
		{
			Reporter.log("test1 starts",true);
			Reporter.log("test1 ends",true);

		}
}
