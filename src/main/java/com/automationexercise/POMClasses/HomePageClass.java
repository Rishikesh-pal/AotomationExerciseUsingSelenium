package com.automationexercise.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageClass {
	private WebDriver driver;
	@FindBy(xpath="//a[text()=' Signup / Login']") private WebElement signup;
	
	public HomePageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickSihnup() {
		signup.click();
	}

}
