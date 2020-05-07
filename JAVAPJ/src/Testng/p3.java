package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class p3 
{
	@BeforeMethod
	public void abc()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void xyz()
	{
		System.out.println("after method");
	}
	
	@Test
	public void def()
	{
		System.out.println("From test1");
	}
	
	@Test
	public void ghi()
	{
		System.out.println("From test2");
	}
}
