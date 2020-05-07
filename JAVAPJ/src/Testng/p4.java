package Testng;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class p4 

{
	@Test
	public void Banana()
	{
	       Reporter.log("banana");
	}
	
	@Test
	public void a()
	{
		System.out.println("from a()");
	}
	
	@Test
	public void orange()
	{
		Reporter.log("from orange");
	}
	
	
}
