package Seltest;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class disable_jsexecuter 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
        
		WebDriver driver=new FirefoxDriver();
         driver.get("file://C:/Users/niki-pc/Desktop/disable.html");
        driver.findElement(By.id("a1")).sendKeys("abc");
        Thread.sleep(3000);
        JavascriptExecutor js=(JavascriptExecutor)driver; 
        String gelelvalue="document.getElementById('a2').value='Qspider'";
       js.executeScript(gelelvalue);
        driver.close();
	}

	

	

}
