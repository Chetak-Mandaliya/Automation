package com.assignmentwebdriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog13
{
	WebDriver driver;
	
	@Before
	public void before() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fdata&ec=GAlAFw&hl=en-GB&service"
				+ "=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-32907151%3A1702300990494011&theme=glif");
		Thread.sleep(1500);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys("7801817679");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("Passwd")).sendKeys("7801817679");
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1500);
	}
	
	@After
	public void after()
	{
		driver.close();
		System.out.println("we cannot sign in google with the browser which is controlled by automated software");
	}
}
