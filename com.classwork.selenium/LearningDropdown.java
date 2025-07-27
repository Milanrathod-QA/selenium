package com.classwork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningDropdown {
	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningDropdown learningDropdown = new LearningDropdown();
		learningDropdown.openBrowser("https://tutorialsninja.com/demo/index.php?route=product/category&path=20_27");
		learningDropdown.selectValue();
	}
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
//index,value attribute,visible text
	public void selectValue() {
		Select dropdown = new Select(driver.findElement(By.id("input-sort")));
		//dropdown.selectByIndex(5);
		//dropdown.selectByValue("https://tutorialsninja.com/demo/index.php?route=product/category&path=20_27&sort=rating&order=DESC");
		dropdown.selectByVisibleText("Model (Z - A)");
	}
	
}
