package Testng;

import org.testng.annotations.Test;
import org.testng.Reporter;


public class p2 
{
	@Test
	public void Test2()
	{
		Reporter.log("From Test 2 ");
	}
	@Test
	public void Test1()
	{
		System.out.println("From Test 1");
	}
}
