package com.assignmentwebdriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Prog15 
{
	WebDriver driver=null;
	@DataProvider(name="chetak")
	public Object[][] input()
	{
		return new Object[][] {{"7801817679","1"},{"chetaksoni.72@gmail.com","chetak@1"},{"chetaksoni.72@gmail.com","chetak@1"}};
	}
	@Test
	//(DataProvider = "chetak")
	public void loginbutton(String username,String password) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
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
			Fail("LoginButton failed");
		}
		driver.findElement(By.cssSelector("input[style=\"height:40px;width:40px\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("xu06os2 x1ok221b")).click();
		Thread.sleep(2000);
		driver.close();
	}
	private void Fail(String string) 
	{
		// TODO Auto-generated method stub
		
	}
}
