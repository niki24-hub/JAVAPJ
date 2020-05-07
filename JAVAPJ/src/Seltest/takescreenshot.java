package Seltest;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class takescreenshot 
{
	static
    {
    	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
    }
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		//typecasting object to take screenshot
		TakesScreenshot t1=(TakesScreenshot)driver;
		//calling getscreenshot method & save it to the source file
		File srcfile=t1.getScreenshotAs(OutputType.FILE);
		//move src file to destination file
		File destfile=new File("./Data/google.png");
		FileUtils.copyFile(srcfile,destfile);
		driver.close();
	}

}
