package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningIframe {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningIframe learningIframe =  new LearningIframe();
		learningIframe.openBrowser("https://demo.automationtesting.in/Frames.html");
		learningIframe.implementIframe();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void implementIframe() {
		driver.switchTo().frame(driver.findElement(By.id("singleframe")));   //jump into Iframe
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).click();
	}
}
//amazon + auto pra+ wait