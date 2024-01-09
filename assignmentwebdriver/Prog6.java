package com.assignmentwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		Thread.sleep(1500);
		
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.name("country")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
				           + "td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select/option[108]")).click();
		Thread.sleep(1500);
		
		driver.close();
	}
}
