package Seltest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class readSATE

{

	@FindBy (id="username")
	private WebElement unbtn;
	@FindBy (name="pwd")
	private WebElement pwdbtn;
	@FindBy (xpath="//div[.='Login ']")
	private WebElement lginbtn;
	
	readSATE(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usname(String un)
	{
		unbtn.sendKeys("admin");
	}
	public void password(String pwd)
	{
		pwdbtn.sendKeys("manager");
	}
	public void loginclick()
	{
		lginbtn.click();
	}
	
		
}
	
