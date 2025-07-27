package com.homework.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraWithXpath {

	WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyntraWithXpath myntraWithXpath = new MyntraWithXpath();
		myntraWithXpath.openBrowser("https://www.myntra.com/");
		myntraWithXpath.mouseHover();
		myntraWithXpath.clickTshirt();
		myntraWithXpath.urlVerification();
		myntraWithXpath.clickItems();
	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void mouseHover() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@data-group='men']"))).perform();
	}
	
	public void clickTshirt() {
		List<WebElement> itemcategory = driver.findElements(By.xpath("//a[@href='/men-tshirts']"));
		for (WebElement element : itemcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("T-Shirts")) {
				element.click();
				break;
			}else {
				System.out.println(getcategory);
			}
		}
	}
	
	public void urlVerification() {
		/*String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.myntra.com/men-tshirts");*/
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String Url = "https://www.myntra.com/men-tshirts";
		String currentUrl = driver.getCurrentUrl();
		
		if (currentUrl.equals(Url)) {
            System.out.println("Redirect successful: User is on the valid page.");
            System.out.println(driver.getCurrentUrl());
        } else {
            System.out.println("Redirect failed: User is on the wrong page.");
            System.out.println(driver.getCurrentUrl());
        }
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void clickItems() {
		
		/*
		 * List<WebElement> itemcategory =
		 * driver.findElements(By.xpath("//*[@class='product-brand']"));
		 * 
		 * for (int j = 0; j < itemcategory.size(); j++) { String s =
		 * itemcategory.get(j).getText(); System.out.println(s); }
		 */
		ArrayList<WebElement> list = new ArrayList<WebElement>(driver.findElements(By.xpath("//*[@class='product-brand']")));
		for (int i=0; i< list.size(); i++) {
			String s = list.get(i).getText();
			System.out.println(s);
		}
		
		/*for (WebElement element : itemcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("Blouses")) {
				element.click();
				break;
			}else {
				//System.out.println(getcategory);
			}
		}*/
		
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(driver.findElement(By.
		 * xpath("//*[text()='MARVEL STREET']"))).perform(); action.click();
		 */
		/*WebElement element = driver.findElement(By.xpath("//*[text()='MARVEL STREET']"));
		element.click();*/
		System.out.println(driver.getTitle());
		
		
		
	}
	
}
