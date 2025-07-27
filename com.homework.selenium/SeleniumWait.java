package com.homework.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWait {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumWait seleniumWait = new SeleniumWait();
		seleniumWait.openBrowser("https://www.amazon.in/");
		seleniumWait.clickMobile();
		seleniumWait.closeBrowser();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("EN")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Start here.")));
	}
	
	public void clickMobile() {
		
		WebElement element = driver.findElement(By.linkText("Start here."));
		element.click();
	}
	
	public void closeBrowser() {
		driver.quit();
	}


}
