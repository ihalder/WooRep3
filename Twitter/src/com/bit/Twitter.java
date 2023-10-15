package com.bit;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Twitter {
	
	
	WebDriver dr;
	
	public void hello() {
		int i = 0;
		String f = "Hello";
	}
	
	public void openChromeBrowser() {
		
		//System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		//it will open a blank browser
		dr = new ChromeDriver();
	}
	
	public void openFirefoxBrowser() {
		
		//System.setProperty("webdriver.gecko.driver", "/Users/ihalder/Downloads/geckodriver");
		//it will open a blank browser
		dr = new FirefoxDriver();
	}
	
	public void closeBrowser() throws InterruptedException {
		myWait(4000);
		dr.quit();
	}
	
	
	public void myWait(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	public void goToAnyWebsite(String url) {
		dr.get(url);
		//dr.get("https://www.facebook.com/");
		//dr.get("https://www.target.com/");
	}
	
	public void targetSearch() {
		
		dr.findElement(By.cssSelector("input#search")).sendKeys("kids shoes");
		dr.findElement(By.xpath("//nav/div[6]//button[2]")).click();
		
	}
	
	public void clickOnAnyElement(By locator) {
		
		dr.findElement(locator).click();
		
	}

	public void clickOnElementByCss(String cssValue) {
		
		dr.findElement(By.cssSelector(cssValue)).click();
	}
	
	public void clickOnAnyElementByXpath(String xpathValue) {
		
		dr.findElement(By.xpath(xpathValue)).click();
	}
	
	public void typeOnAnyElement(String value, By by) {
		
		dr.findElement(by).clear();  //Questions?????
		dr.findElement(by).sendKeys(value);
		
	}
	
	public void verifyelementDisplay(By ele) {
		System.out.println(dr.findElement(ele).isDisplayed());
	}
	
	public void verifyTitle(String expectedTitle) {
		//if any reference returns any value and if we want that value
		//we have to assign that reference to another variable
		String actualTitle = dr.getTitle();
		//int s = 12+2-(22*3);
		
		boolean j = actualTitle.equals(expectedTitle);
		
		//if(actualTitle.equals(expectedTitle))
		if(j) {
			System.out.println("Title matched");
			
		}else {
			System.out.println("Title did not match");
		}
		
		
	}

}
