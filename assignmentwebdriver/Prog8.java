package com.assignmentwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ch.qos.logback.core.joran.action.Action;

public class Prog8 
{
	public static void main(String[] args) throws InterruptedException 
	{	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver-win32_1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(1500);
		
		WebElement home=driver.findElement(By.linkText("Home"));
		WebElement vacations=driver.findElement(By.linkText("Vacations"));
		WebElement hotels=driver.findElement(By.linkText("Hotels"));
		
		Actions actions=new Actions(driver);
		Action a1=(Action) actions.moveToElement(vacations).build();
		((org.openqa.selenium.interactions.Action) a1).perform();
		Thread.sleep(1500);
		
		Action a2=(Action) actions.moveToElement(hotels).build();
		((org.openqa.selenium.interactions.Action) a2).perform();
		Thread.sleep(1500);
		
		Action a3=(Action) actions.moveToElement(home).build();
		((org.openqa.selenium.interactions.Action) a3).perform();
		
		driver.close();
	}
}
