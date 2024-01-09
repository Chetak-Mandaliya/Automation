package com.assignmentwebdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog12 
{
	WebDriver driver;
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1500);
	}	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("chetak");
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys("chetak.1");
		Thread.sleep(500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	@After
	public void after() throws InterruptedException
	{
		driver.close();
	}
}
