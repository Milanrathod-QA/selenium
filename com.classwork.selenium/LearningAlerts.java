package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlerts {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningAlerts learningAlerts = new LearningAlerts();
		learningAlerts.openBrowser("https://demo.automationtesting.in/Alerts.html");
		learningAlerts.handleAlert();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void handleAlert() {
		driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}

}
