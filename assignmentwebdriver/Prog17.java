package com.assignmentwebdriver;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Prog17 
{
	WebDriver driver=null;
	
	@BeforeTest
	public void beforeTest() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
	}
	@org.junit.Test
	
	@Parameters({"username","password"})
	public void Test(String username,String password) throws InterruptedException 
	{
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1500);
		
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1500);
		
		driver.findElement(By.name("login")).click();
		
		if (driver.getTitle().equals("(20+)Facebook")) 
		{
			System.out.println("Test has been Passed...");
		} 
		else 
		{
			System.out.println("Test gets failed..");
			fail("LoginButton failed");
		}
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException 
	{
		driver.findElement(By.cssSelector("input[style=\"height:40px;width:40px\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("xu06os2 x1ok221b")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
