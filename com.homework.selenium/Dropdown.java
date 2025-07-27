package com.homework.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dropdown dropdown =  new Dropdown();
		//dropdown.opneBrowser("https://www.amazon.in/");
		dropdown.opneBrowser("http://www.automationpractice.pl/index.php?id_category=7&controller=category");
	//	dropdown.selectDropdownValue();
		dropdown.selectDrop();
	}
	public void opneBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		//driver.close();
	}
	public void selectDropdownValue() {
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		//dropdown.selectByIndex(11);  //select drop-down value with their index
		//dropdown.selectByValue("search-alias=stripbooks"); //select drop-down with their value name
		dropdown.selectByVisibleText("Books"); //select drop-down with their visible text
		
		boolean verification = driver.findElement(By.name("url")).isEnabled();
		System.out.println(verification);
		
		boolean display = driver.findElement(By.name("url")).isDisplayed();
		System.out.println(display);
	}
	 public void selectDrop() {
		 driver.findElement(By.id("uniform-selectProductSort"));
		 driver.findElement(By.xpath("//*[@value='quantity:desc']")).click();
	 }
}
