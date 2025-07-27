package com.homework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScrolling {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebScrolling webScrolling = new WebScrolling();
		webScrolling.opneBrowser("https://www.amazon.in/");
		webScrolling.implementScroll();
	}
	public void opneBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void implementScroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.linkText("100% Purchase Protection")));
	
	}

}
