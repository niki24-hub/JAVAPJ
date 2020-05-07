package Seltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class p1

{
static
{
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		driver.close(); // TODO Auto-generated method stub

	}

}
