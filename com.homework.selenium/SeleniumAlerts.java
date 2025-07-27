package com.homework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumAlerts seleniumAlerts = new SeleniumAlerts();
		seleniumAlerts.openBrowser("https://demo.automationtesting.in/Alerts.html");
		
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void clickAlert() {
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.cssSelector("a[href='#CancelTab']")).click();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.switchTo().alert().accept();
	}

}
