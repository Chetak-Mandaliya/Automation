package com.assignmentwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/radio.html");
		Thread.sleep(1500);
		
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(1500);
		
		driver.close();
	}
}
