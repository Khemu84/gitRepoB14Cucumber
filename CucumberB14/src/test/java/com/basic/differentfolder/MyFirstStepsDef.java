package com.basic.differentfolder;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFirstStepsDef {
	
	WebDriver driver;
	
	@Given ("^User need to be on facebook login page$")
	public void User_need_to_be_on_facebook_login_page() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","H:\\Selenium_Doc\\Software\\Selenium_all_drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
	}
	
	@When("^User enters user \"([^\"]*)\" first name$")
	public void User_enters_user_first_name(String uName){
		//driver.findElement(By.name("firstname")).sendKeys(uName);
		driver.findElement(By.xpath(".//input[@name='firstname']")).sendKeys(uName);
		
	}

	
	@When("^User enters \"([^\"]*)\" surname$")
	public void User_enters_surname(String sName){
		//driver.findElement(By.name("lastname")).sendKeys(uName);
		driver.findElement(By.xpath(".//input[@name='lastname']")).sendKeys(sName);
		
	}

	@When("^User enters \"([^\"]*)\" mobile no$")
	public void User_enters_mobile_no(String mNumber){
		driver.findElement(By.xpath(".//input[@name='reg_email__']")).sendKeys(mNumber);
		
	}
	
	
	
	@Then("^User checks user \"([^\"]*)\" first name is present$")
	public void User_checks_user_first_name_is_present(String name){
		
		//String userNameActual = driver.findElement(By.name("firstname")).getAttribute("value");
		String userNameActual = driver.findElement(By.xpath(".//input[@name='firstname']")).getAttribute("value");
		//Assert.assertTrue(true);
		Assert.assertEquals(name,userNameActual);
		
	}
}
