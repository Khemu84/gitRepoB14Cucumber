package com.basic.datatableSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DataTableStepDef {
	
	
	WebDriver driver =null;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page(){
		System.setProperty("webdriver.chrome.driver","H:\\Selenium_Doc\\Software\\Selenium_all_drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Then("close browser")
	public void close_browser(){
		driver.quit();
		driver =null;
	}
	
	@When("Enter followind data")
	public void enter_followind_data(DataTable table) throws InterruptedException{
		
		List<List<String>> data = table.raw();
		
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		String values3 = data.get(0).get(2);
		
		
		String values4 = data.get(1).get(0);
		String values5 = data.get(1).get(1);
		String values6 = data.get(1).get(2);
		
		driver.findElement(By.name("firstname")).sendKeys(values4);
		driver.findElement(By.name("lastname")).sendKeys(values5);
		driver.findElement(By.name("reg_email__")).sendKeys(values6);
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("reg_email__")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys(data.get(2).get(0));
		driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("reg_email__")).sendKeys(data.get(2).get(2));
		Thread.sleep(2000);
		
		Select dropdownB = new Select(driver.findElement(By.name("birthday_day"))); 
	      dropdownB.selectByValue("2"); 
			
	      Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
	      dropdownM.selectByValue("2"); 
			
	      Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
	      dropdownY.selectByValue("1984"); 
			
	      //driver.findElement(By.className("_58mt")).click(); 
	      // Click submit button driver.findElement(By.name("websubmit")).click(); 
	
	}
	
	
}
