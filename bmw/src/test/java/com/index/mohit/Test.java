package com.index.mohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

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

		Thread.sleep(6000);

		// Cling on one way
		driver.findElement(By.xpath("//div[@class = 'widget__triptype']//div[2]/label")).click();

		// clinking on coach
		driver.findElement(By.id("travellerButton")).click();

		// select the 3 adult

		for (int i = 1; i < 3; i++) {
			driver.findElement(By.id("addadults")).click();

			driver.findElement(By.id("addseniors")).click();

		}

		WebElement dropdown = driver.findElement(By.id("Class"));

		// System.out.println("total values in a dropdown are >> "+ dropdown.getText());

		// Use select class constructor two select values from list box 
		
		Select sc = new Select(dropdown);
		
	//	select values from the dropdown business using method
		
		sc.selectByIndex(2);
		
		//click on done button
		
		driver.findElement(By.id("closeDialog")).click();
		
	}

}
