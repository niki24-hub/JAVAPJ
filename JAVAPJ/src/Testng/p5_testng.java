package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class p5_testng 

{
      static
      {
    	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
      }
      
      WebDriver driver;
      
      @Test
      public void test1()
      {
    	  String expected="booooooooooooooooogle";
    	  String actual=driver.getTitle();
    	  if(actual.equals(expected))
    	  {
    		  Reporter.log("test is passed",true);
    	  }
    	  else
    	  {
    		  Reporter.log("test is failed",true);
    		  Assert.fail();
    	  }
    	  
      }
      
      @Test
      public void test2()
      {
    	  System.out.println("From Test2");
      }
      
      @BeforeMethod
      public void start()
      {
    	  driver=new FirefoxDriver();
    	  driver.get("https://www.google.com");
      }
      
      
      @AfterMethod
      public void close()
      {
    	  driver.close();
      }
}