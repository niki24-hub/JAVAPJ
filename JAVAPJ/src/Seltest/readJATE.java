package Seltest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class readJATE {
	static
    {
  	  System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
    }
   public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException 
{   
      //defining excel file
	String path="./data/book1.xlsx";
	Workbook wb=WorkbookFactory.create(new FileInputStream(path));	
	
	  //automating site
	  WebDriver driver=new FirefoxDriver();
	  Thread.sleep(3000);
	  driver.manage().deleteAllCookies();
	  driver.get("https://demo.actitime.com/login.do"); 
	  
	//find elements from site page class
	  readSATE p2=new readSATE(driver);
	 
  for (int i=0;i<=5;i++)
  {
  String usn=wb.getSheet("sheet1").getRow(0).getCell(i).toString();
  String pass=wb.getSheet("sheet1").getRow(1).getCell(i).toString();
   p2.usname(usn);
   Thread.sleep(3000);
   p2.password(pass);
   Thread.sleep(3000);
   p2.loginclick();
  }
	
  driver.close();
}
}

	


