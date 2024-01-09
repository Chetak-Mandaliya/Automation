package com.assignmentwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(1500);
		List<WebElement> total_link=driver.findElements(By.tagName("a"));
		int count=total_link.size();
		System.out.println("The Total no. of links is "+count);
		for (int i=0; i<count; i++) 
		{
			System.out.print((i+1)+"  ");
			System.out.println(total_link.get(i).getText());
		}
		driver.close();
	}
}
