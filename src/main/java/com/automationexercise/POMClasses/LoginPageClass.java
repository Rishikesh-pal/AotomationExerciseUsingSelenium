package com.automationexercise.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@data-qa='login-email']")private WebElement loginMail;
	@FindBy(xpath="//input[@data-qa='login-password']")private WebElement loginPassword;
	@FindBy(xpath="//button[@data-qa='login-button']")private WebElement login;
	@FindBy(xpath="//input[@data-qa='signup-name']")private WebElement signupName;
	@FindBy(xpath="//input[@data-qa='signup-email']")private WebElement signupEmail;
	@FindBy(xpath="//button[@data-qa='signup-button']")private WebElement signup;
	@FindBy(css="input#susbscribe_email")private WebElement subscribeMail;
	@FindBy(css="button#subscribe")private WebElement subscribeButton;
	@FindBy(xpath="//h2[text()='New User Signup!']")private WebElement signupMsg;
	
	public LoginPageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void entersignupEmail() {
		signupEmail.sendKeys("gym@gmail.com");
	}
	
	public void entersignupName() {
		signupName.sendKeys("Rishikesh");
	}
	
	public void clicksignup() {
		signup.click();
	}
	
	public boolean verifySignupMsg() {
//		signupMsg.getText();
		boolean result=signupMsg.isDisplayed();
		return result;
		
	}
	

}
