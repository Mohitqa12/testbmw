package com.index.mohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffAlert {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver(); 
		
		driver.navigate().to("https://www.rediff.com");
		
		//driver.findElement(By.partialLinkText("Sign in")).click();

	}

}
