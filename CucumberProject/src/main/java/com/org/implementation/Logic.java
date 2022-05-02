package com.org.implementation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logic {
	public static WebDriver driver;

	@Given("^: user is on facebook application$")
	public void user_is_on_facebook_application() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	}

	@When("^: user enters username <email> and password <pass>$")
	public void user_enters_username_email_and_password_pass(DataTable arg1) throws Throwable {
	 List<List<String>> raw = arg1.raw();
	 driver.findElement(By.id("email")).sendKeys(raw.get(0).get(0));
	 driver.findElement(By.id("pass")).sendKeys(raw.get(0).get(1));
	}

	@Then("^: user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("^: user closes the application$")
	public void user_closes_the_application() throws Throwable {
		Thread.sleep(5000);
		driver.quit();
	}
}
