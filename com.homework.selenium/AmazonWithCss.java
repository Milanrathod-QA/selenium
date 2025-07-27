package com.homework.selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWithCss {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonWithCss amazonWithCss = new AmazonWithCss();
		amazonWithCss.openBrowser("https://www.amazon.in/");
		amazonWithCss.selectDropdown();
		amazonWithCss.textboxValue();
		amazonWithCss.implementScroll();
		amazonWithCss.clickBook(); //not done with cssselector
		amazonWithCss.addCrt();
		amazonWithCss.verifyCart();
		amazonWithCss.openTab();
		amazonWithCss.fileUpload();
		amazonWithCss.selectDropdown1();
		amazonWithCss.frameTextbox();
		amazonWithCss.switchTab();
		amazonWithCss.updateCart();
		amazonWithCss.closeBrowser();
		
	}
	public void openBrowser(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	//method for dropdown selection
	public void selectDropdown() {
		
		List<WebElement> lstcategory = driver.findElements(By.cssSelector("select>option"));
		for (WebElement element : lstcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("Books")) {
				element.click();
				break;
			}else {
				//System.out.println(getcategory);
			}
		}
	}
	
	//method for enter value in text box and click
	public void textboxValue() {
	WebElement element = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	element.sendKeys("prompt engineering");
     driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
     
	}
	
	public void implementScroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments [0].scrollIntoView();", driver.findElement(By.linkText("Prompt Engineering for Generative AI: Future-Proof Inputs for Reliable AI Outputs (Grayscale Indian Edition)")));
	}
	
	//method for click any books values 
	public void clickBook() {
		/*WebElement element = driver.findElement(By.cssSelector("#c44dfe67-e25a-4db8-a806-eb95a8b34631 > div > div > span > div > div > div > div.puisg-col.puisg-col-4-of-4.puisg-col-4-of-8.puisg-col-8-of-12.puisg-col-8-of-16.puisg-col-12-of-20.puisg-col-12-of-24.puis-list-col-right > div > div > div.a-section.a-spacing-none.puis-padding-right-small.s-title-instructions-style.puis-desktop-list-title-instructions-style > a"));
		element.click();*/
		//driver.findElement(By.cssSelector("div>div>div>div>a[href='/Prompt-Engineering-Generative-Future-Proof-Grayscale/dp/9355424655/ref=sr_1_3?crid=S8E9LC9V1R56&dib=eyJ2IjoiMSJ9.rqFin8S8B38bnrB-kNWW-bCqgDNbKYmkkWGYLFhs1RpdsVVKqtNFWm7jYauC4y1PJMrwScfWwpr9z3LF02PJUU09be3OQoUi4vuGMauNYH0PY-4GHqWpi9vsGck9Qz32bXt8tPk0nR_H06uUVh1owXoxvZxT72QduXCg2CGlcBve69CAhpRtvh3BEX1IhfbgShe7ooISNlc1fYCoILHP0807fb79HiOWyKv50RPa0e8.CRKtf2-uRA4xEU5SIXW6Rn_FqDpPDrJbPh82GGN6oT0&dib_tag=se&keywords=prompt+engineering&qid=1751461486&s=books&sprefix=prompt+%2Cstripbooks%2C242&sr=1-3']")).click();
		//driver.findElement(By.cssSelector("a[href='/Prompt-Engineering-Generative-Future-Proof-Grayscale/dp/9355424655/ref=sr_1_3?crid=S8E9LC9V1R56&dib=eyJ2IjoiMSJ9.rqFin8S8B38bnrB-kNWW-bCqgDNbKYmkkWGYLFhs1RpdsVVKqtNFWm7jYauC4y1PJMrwScfWwpr9z3LF02PJUU09be3OQoUi4vuGMauNYH0PY-4GHqWpi9vsGck9Qz32bXt8tPk0nR_H06uUVh1owXoxvZxT72QduXCg2CGlcBve69CAhpRtvh3BEX1IhfbgShe7ooISNlc1fYCoILHP0807fb79HiOWyKv50RPa0e8.CRKtf2-uRA4xEU5SIXW6Rn_FqDpPDrJbPh82GGN6oT0&dib_tag=se&keywords=prompt+engineering&qid=1751461486&s=books&sprefix=prompt+%2Cstripbooks%2C242&sr=1-3']")).click();
	//driver.findElement(By.linkText("Prompt Engineering for Generative AI: Future-Proof Inputs for Reliable AI Outputs (Grayscale Indian Edition)")).click();
		
		List<WebElement> lstcategory = driver.findElements(By.cssSelector("h2>span"));
		for (WebElement element : lstcategory) {
			String getcategory =  element.getText();
			if (getcategory.equals("Prompt Engineering for Generative AI: Future-Proof Inputs for Reliable AI Outputs (Grayscale Indian Edition)")) {
				element.click();
				break;
			}else {
				//System.out.println(getcategory);
			}
		}
	}
	
	//method for click cart button with css selectors
	public void addCrt() {
		WebElement element = driver.findElement(By.cssSelector("#add-to-cart-button"));
		element.click();
	}
	
	//method for verify the item is added on cart
	public void verifyCart() {
		WebElement cartcount = driver.findElement(By.cssSelector("#nav-cart-count"));
		System.out.println("Your amazon cart item count is " + cartcount.getText());
		}
	
	//method for open new tab
	public void openTab() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
	}
	
	public void fileUpload() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement element = driver.findElement(By.cssSelector("#imagesrc"));
		element.sendKeys("C:\\Users\\A\\Pictures\\sign-.jpg");
	}
	
	public void selectDropdown1() {
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.cssSelector("a[href='Frames.html']")).click();
		
	}	
	public void frameTextbox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//click on iframe with in an iframe button
		driver.findElement(By.cssSelector("a[href=\"#Multiple\"]")).click();
		
		//redirect frame 1
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src=\"MultipleFrames.html\"]")));
		
		//redirect subframe 2
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src=\"SingleFrame.html\"]")));
		
		//wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on text box
		driver.findElement(By.cssSelector("input[type=text]")).sendKeys("ok"); 
		
		// to check that text box is enable or not
		boolean verification = driver.findElement(By.cssSelector("input[type=text]")).isEnabled(); 
		System.out.println(verification + " Text box is enabled");
	}
	
	public void switchTab() {
		ArrayList<String> lsttab = new ArrayList<String>(driver.getWindowHandles()); //switching tab
		driver.switchTo().window(lsttab.get(0));
		System.out.println(driver.getTitle());
		
	}
	//method for switch tab forward tab and remove cart items
	public void updateCart() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //implicit wait for 3 sec
		WebElement nvigation = driver.findElement(By.cssSelector("#nav-cart-count-container"));
		nvigation.click();
		
		
		WebElement cart = driver.findElement(By.cssSelector("span[data-a-selector='increment-icon']"));
		cart.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Start here.")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("#nav-cart-count")));
		
		WebElement itemcount = driver.findElement(By.cssSelector("#nav-cart-count"));
		System.out.println("Your amazon cart item subtotal is " + itemcount.getText());
		
		WebElement price = driver.findElement(By.cssSelector("#sc-subtotal-amount-buybox"));
		System.out.println("Total price is " + price.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //implicit wait for 10 sec
	}
	
	//method for quite the session and close the browser
	public void closeBrowser() {
		driver.quit();
	}
}
