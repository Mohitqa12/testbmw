package com.index.mohit;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheapoAirOneWay {

	public static WebDriver driver;

	public static String url = "https://www.cheapoair.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// step-2: open blank Chrome browser
		driver = new ChromeDriver();

		// get web site URL
		driver.navigate().to(url);

		// window maximze
		driver.manage().window().maximize(); // mwm

		Thread.sleep(2000);

		// System.out.println(driver.getTitle());

		String actuallogo = driver.findElement(By.xpath("//*[@id=\'app\']/header/div/div/div[1]/a")).getText();

		System.out.println(actuallogo);

		String expectedlogo = "CheapOair";
		
		//if (actuallogo.equals(expectedlogo))


		//if (actuallogo.equalsIgnoreCase(expectedlogo))

		
		if (actuallogo.contains(expectedlogo))

		{
			System.out.println("pass");

		} else {
			System.out.println("fail");
		}

		/*
		 * //driver.findElement(By.xpath("//input[@id='onewayTrip']")).click();
		 * 
		 * 
		 * List<WebElement> dropdown = driver.findElements(By.name("tripType"));
		 * 
		 * // System.out.println(dropdown.size());
		 * 
		 * for(int i=0; i<dropdown.size(); i++) {
		 * 
		 * dropdown = driver.findElements(By.name("tripType"));
		 * 
		 * 
		 * dropdown.get(i).click(); }
		 */

	}

}
