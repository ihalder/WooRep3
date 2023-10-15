package com.bit;

import org.openqa.selenium.By;


public class Twi_Scenario {
	
	Twitter s = new Twitter();
	
	
	/* Test case scenario:
	 * Open chrome browser 
	 * navigate to facebook.com 
	 * verify homePage title 
	 * click on Create new account button
	 * enter first name 
	 * enter last name 
	 * enter email 
	 * enter password 
	 * click on Create Account button 
	 * close browser
	 */
	public void TwitterSignup() throws InterruptedException {
		s.openFirefoxBrowser();
		//s.openChromeBrowser();
		
		s.goToAnyWebsite("https://twitter.com/");
		s.myWait(3000);
		s.verifyTitle("Explore / Twitter"); 
		s.clickOnAnyElementByXpath("//span[text()='Sign up']");  //click on Sign Up
		s.myWait(3000);
		s.clickOnAnyElementByXpath("//span[text()='Create account']"); // Create account
		s.myWait(3000);
		s.typeOnAnyElement("Woo Smoke", By.xpath("//input[@name='name']")); //First name
		s.myWait(3000);
		s.typeOnAnyElement("9092092092", By.xpath("//input[@name='phone_number']"));  //Phone Number
		s.myWait(4000);
		s.clickOnAnyElementByXpath("//select[@id='SELECTOR_1']/option[10]"); //Month
		s.clickOnAnyElementByXpath("//select[@id='SELECTOR_2']/option[10]"); //Day
		s.myWait(3000);
		s.clickOnAnyElementByXpath("//select[@id='SELECTOR_3']/option[33]"); //Year
		s.clickOnAnyElementByXpath("//span[text()='Next']"); //Next Button

		
		
		
		//s.closeBrowser();*/
	}
	

}
