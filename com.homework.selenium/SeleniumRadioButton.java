package com.homework.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumRadioButton {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumRadioButton SeleniumRadioButton = new SeleniumRadioButton();
		SeleniumRadioButton.openBrowser();
		SeleniumRadioButton.clickButtons();
	}
	
	public void openBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://www.goindigo.in/");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void clickButtons() {
		//driver.findElement(By.id("gender-radio-1")).click();
		//driver.findElement(By.name("Male")).click();
		
		List<WebElement> radio = driver.findElements(By.xpath("//*[@tabindex='2']"));
		for (WebElement element : radio) {
			String getcategory =  element.getText();
			if (getcategory.equals("Round Trip")) {
				element.click();
				break;
			}else {
				System.out.println(getcategory);
			}
		}
		
		/*if (radio.isEnabled()) {
			radio.click();
		}else {
			System.out.println("Radio is not clickable");
		}*/
		
		
	}

}
