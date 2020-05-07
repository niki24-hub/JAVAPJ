package Seltest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class screenshot_wait {


		static
	    {
	    	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	    }
		public static void main(String[] args) throws IOException 
		{
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.fb.com");
			//typecasting object to take screenshot
			TakesScreenshot t1=(TakesScreenshot)driver;
			//calling getscreenshot method & save it to the source file
			File srcfile=t1.getScreenshotAs(OutputType.FILE);
			//move src file to destination file
			File destfile=new File("./Data/fb1.png");
			FileUtils.copyFile(srcfile,destfile);  
			driver.findElement(By.id("email")).sendKeys("8660281165");
			driver.findElement(By.id("pass")).sendKeys("Nikki@123");
			driver.findElement(By.id("loginbutton")).click();
            File src1= t1.getScreenshotAs(OutputType.FILE);
            File dest1=new File("./Data/hmpg.png");
            FileUtils.copyFile(src1,dest1);
            driver.findElement(By.id("userNavigationLabel")).click(); 
            driver.findElement(By.xpath("(//span[.='Log Out'])[2]")).click(); 
            WebDriverWait wait=new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.titleContains("log in or sign up"));
            File src2=t1.getScreenshotAs(OutputType.FILE);
            File dest2=new File("./Data/login.png");
            FileUtils.copyFile(src2,dest2);
			driver.close();
		}

	}
