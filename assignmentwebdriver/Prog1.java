package com.assignmentwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 
{
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("A/B Testing")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.findElement(By.partialLinkText("A/B Test")).click();
		Thread.sleep(2000);
		
		driver.close();
	}
}
