package Testng;

import org.testng.annotations.Test;

public class p1 
{
    @Test (priority=9)
	public void car()
	{
		System.out.println("From car");
	}
	
	@Test(priority=5)
	public void Fruit()
	{
		System.out.println("Apple ");
	}
	
	@Test
	public void veggies()
	{
		System.out.println("cabbage");
	}
	
	@Test(priority=2)
	public void shapes()
	{
		System.out.println("circle");
	}
}
