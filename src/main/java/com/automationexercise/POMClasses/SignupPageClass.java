package com.automationexercise.POMClasses;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPageClass {
	private WebDriver driver;
	
	
	@FindBy(xpath="//input[@data-qa='login-email']")private WebElement loginMail;
	@FindBy(xpath="//input[@data-qa='login-password']")private WebElement loginPassword;
	@FindBy(xpath="//button[@data-qa='login-button']")private WebElement login;
	@FindBy(xpath="//input[@data-qa='signup-name']")private WebElement signupName;
	@FindBy(xpath="//input[@data-qa='signup-email']")private WebElement signupEmail;
	@FindBy(xpath="//button[@data-qa='signup-button']")private WebElement signup;
	@FindBy(css="input#susbscribe_email")private WebElement subscribeMail;
	@FindBy(css="button#subscribe")private WebElement subscribeButton;
	
	public SignupPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterloginMail() {
		loginMail.sendKeys();
	}

}
