package com.assignmentwebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog9
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1500);
		
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Chetak");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		Thread.sleep(1500);
		Alert a1=driver.switchTo().alert();
		a1.accept();
		a1.accept();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("Chetak");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input[name=\"submit\"]")).click();
		Thread.sleep(1500);
		a1.dismiss();
		Thread.sleep(1500);
		driver.close();
	}
}
