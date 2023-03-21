package com.automationexercise.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	
	public WebDriver driver;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]") private WebElement signup;
	
	public HomePageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSignup() {
		signup.click();
	}

	

}
