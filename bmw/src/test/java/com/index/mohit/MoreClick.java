package com.index.mohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoreClick {

	public static WebDriver driver;

	public static String url = "https://spicejet.com/";

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		// step-2: open blank Chrome browser
		driver = new ChromeDriver();

		// get web site URL
		driver.navigate().to(url);

		// window maximze

		// driver.manage().window().maximize(); // mwm

		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		// driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).getSize();

	}

}
