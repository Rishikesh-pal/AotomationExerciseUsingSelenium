package com.automationexercise.TestClasses;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationexercise.POMClasses.HomePageClass;
import com.automationexercise.POMClasses.LoginPageClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public WebDriver driver;
	HomePageClass homePage;
	LoginPageClass loginPage;
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
//		WebDriverManager.chromedriver().setup();
		
		
//		Properties prop=new Properties();
//		FileReader reader=new FileReader("configs//TestData.properties");
//		prop.load(reader);


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rishi\\eclipse-workspace\\automationexercise\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();




//		homePage.clickSihnup();
//		Thread.sleep(2000);
//		System.out.println("signup button clicked");
//		loginPage.entersignupEmail();
//		Thread.sleep(2000);
//		System.out.println("signup mail entered");
//		loginPage.entersignupName();
//		Thread.sleep(2000);
//		System.out.println("Name entered");
//		loginPage.clicksignup();
//		System.out.println("sign up button clicked");
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
