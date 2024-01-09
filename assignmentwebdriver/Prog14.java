package com.assignmentwebdriver;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class Prog14
{
String password,username;
	
	public Prog14(String username, String password)
	{
		this.username=username;
		this.password=password;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> input()
	{
		return Arrays.asList(new Object[][] {{"7801817679","chetak@1"}, {"chetak@1","chetak@1"}, {"chetak@1","chetak@1"} });
	}
	WebDriver driver=null;
	
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
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	 	
	@After
	public void after()
	{
		driver.close();
	}
}
