package com.classwork.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearningWait {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningWait learningWait = new LearningWait();
		learningWait.openBrowser("https://www.instagram.com/");
		learningWait.clickBox();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicit wait for 10 sec
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
	}
	

	public void clickBox() {
		WebElement element = driver.findElement(By.name("username"));
		element.click();
		
		/*WebElement element1 = driver.findElement(By.name("password"));
		element1.click();*/
	}

}
