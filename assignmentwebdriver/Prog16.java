
package com.assignmentwebdriver;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prog16 
{
	WebDriver driver=null;
	@BeforeTest
	public void beforetest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fdata&ec"
				+ "=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S1090693243%3A1702900071173021&theme=glif");
		Thread.sleep(2000);
	}
	@Test
	@Parameters({"username","password"})
	public void LoginButton(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("identifier")).sendKeys(username);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(1500);
		driver.findElement(By.name("Passwd")).sendKeys(password);
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
		Thread.sleep(1500);
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1500);
		if (driver.getCurrentUrl().equals("https://mail.google.com/mail/u/0/#inbox")) 
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
  public void afterTest() 
  {
	  driver.close();
	  System.out.println("we cannot sign in google with the browser which is controlled by automated softwere");
  }
}
