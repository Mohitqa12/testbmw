package com.index.mohit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheapoAir {

	public static WebDriver driver;

	public static String url = "https://www.cheapoair.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		//WebDriverManager.chromedriver().setup();

		// step-2: open blank Chrome browser
	//	driver = new ChromeDriver();

		// get web site URL
		driver.navigate().to(url);

		// window maximze
		driver.manage().window().maximize(); // mwm

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='from0']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='from0']")).sendKeys("bengaluru");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='from0']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='from0']")).sendKeys(Keys.ENTER);
	
		WebElement from = driver.findElement(By.id("to0"));

		Thread.sleep(2000);
		from.sendKeys("mumbai");

		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);

		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Select next month']//*[local-name()='svg']")).click();
	
	}

}
