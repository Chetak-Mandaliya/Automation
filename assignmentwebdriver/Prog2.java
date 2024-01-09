package com.assignmentwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/basic-dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		Select selectelement=new Select(driver.findElement(By.id("cars")));
		Thread.sleep(3000);
		
		selectelement.selectByIndex(0);
		Thread.sleep(3000);
		
		selectelement.selectByIndex(2);
		Thread.sleep(3000);
		
		selectelement.selectByIndex(3);
		Thread.sleep(3000);
		
		List<WebElement> options=selectelement.getAllSelectedOptions();
		System.out.println("no of options="+options.size());
		
		for (WebElement obj: options) 
		{
			System.out.println(obj.getText());
		}
		driver.close();
	}
}
