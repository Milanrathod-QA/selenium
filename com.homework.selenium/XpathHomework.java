package com.homework.selenium;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class XpathHomework {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XpathHomework xpathHomework = new XpathHomework();
		xpathHomework.openBrowser("http://www.automationpractice.pl/index.php");
		xpathHomework.mouseHover();
		xpathHomework.sortBy();
		xpathHomework.catalogSelection();
		xpathHomework.verifySelection();
		xpathHomework.hoverandClick();
		xpathHomework.redirectionVerification();
		xpathHomework.colorChanger();
		xpathHomework.addCart();
		//xpathHomework.urlClicks();

	}
	
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public void mouseHover() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@title='Women']"))).perform();
		
		List<WebElement> itemcategory = driver.findElements(By.xpath("//*[@title='Blouses']"));
		for (WebElement element : itemcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("Blouses")) {
				element.click();
				break;
			}else {
				//System.out.println(getcategory);
			}
		}
	}
	
	public void sortBy() {
		WebElement itemList = driver.findElement(By.xpath("//*[@id='selectProductSort']"));
		itemList.click();
		driver.findElement(By.xpath("//option[@value='name:desc']")).click();
		////*[@value='name:desc']
		/*List<WebElement> itemcategory = driver.findElements(By.xpath("//select[@id='selectProductSort']"));
		for (WebElement element : itemcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("Product Name: Z to A")) {
				element.click();
				break;
			}else {
				System.out.println(getcategory);
			}
		}*/
	}
	//*[id='ul_layered_id_attribute_group_1']
	////input[@type='checkbox']
	public void catalogSelection() {
		List<WebElement> itemcategory = driver.findElements(By.xpath("//ul[@id='ul_layered_id_attribute_group_1']//label/a"));
		for (WebElement element : itemcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("S (1)")) {
				element.click();
				break;
			}else {
				System.out.println(getcategory);
			}
		}
		 
		
	}
	
	public void verifySelection() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement title = 	driver.findElement(By.xpath("//*[@id='enabled_filters']//ul/li"));
		System.out.println(title.getText());
		
	}
	
	public void hoverandClick() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();", driver.findElement(By.className("product-count")));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.className("product-container"))).perform();
		
		driver.findElement(By.linkText("More")).click();
	}
	
	public void redirectionVerification() {
		  if(driver.getTitle().contains("Blouse - My Shop")) {
			  System.out.println("valid page" + driver.getTitle());
		  }else {
			  System.out.println("Wrong title");
		  }		
	}
	
	public void colorChanger() {
		//scroll down page
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();", driver.findElement(By.className("home")));
		
		
		//driver.findElement(By.className("attribute_list"));
		//driver.findElement(By.xpath("//*[@id='color_to_pick_list']"));
	/*	List<WebElement> color = driver.findElements(By.xpath("//*[@class='attribute_list']//ul/li"));
		for (WebElement element : color) {
			String getcaolor =  element.getText();
			System.out.println(getcaolor);
			
			if (getcaolor.equals("white")) {
				element.click();
				break;
			}else {
				System.out.println(getcaolor);
			}
	
	}*/
}
	public void addCart() {
		driver.findElement(By.id("color_8")).click();
		//driver.findElement(By.id("add_to_cart")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.findElement(By.xpath("//*[@id='add_to_cart']")).click();
		
		
		boolean display = driver.findElement(By.linkText("Add to cart")).isDisplayed();
		System.out.println(display);
	}
	
	public void urlClicks() {
		//add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		List<WebElement> socialMedia = driver.findElements(By.xpath("//*[@class='socialsharing_product list-inline no-print']//button"));
		for (WebElement element : socialMedia) {
			String getcategory =  element.getText();
			if (getcategory.equals("Tweet")) {
				element.click();
				System.out.println(getcategory + " button clicked");
				break;
			}else {
				System.out.println(getcategory);
			}
		}
	}
}