package com.index.mohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IndianExpress {

	public static WebDriver driver;

	public static String url = "https://www.rediff.com/";

	public static void main(String[] args) {

		try {
			// Steps-1: webdrivermanager used for browser setup.
			WebDriverManager.chromedriver().setup();

			// step-2: open blank Chrome browser
			driver = new ChromeDriver();

			// get web site URL
			driver.navigate().to(url);

			// window maximze

			driver.manage().window().maximize(); // mwm

			Thread.sleep(7000);
			// driver.findElement(By.linkText("Sign in")).click();

			driver.findElement(By.partialLinkText("Sig")).click();

			// quite browser
			driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
