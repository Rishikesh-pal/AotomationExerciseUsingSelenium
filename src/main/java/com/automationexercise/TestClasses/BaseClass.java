package com.automationexercise.TestClasses;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationexercise.POMClasses.HomePageClass;
import com.automationexercise.POMClasses.LoginPageClass;
import com.automationexercise.POMClasses.SignupPageClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public WebDriver driver;
	public static Properties prop;
	HomePageClass homePage=new HomePageClass(driver);
	LoginPageClass loginPage=new LoginPageClass(driver);
	SignupPageClass signupPage=new SignupPageClass(driver);
	
	private static Logger log=  LogManager.getLogger(BaseClass.class.getTypeName());
	
	
	public BaseClass(){
		try{
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Rishi\\eclipse-workspace\\automationexercise\\configs\\TestData.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		System.out.println("Step 1:  Chrome opened ");
		log.info("Chrome opened");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("website"));
		System.out.println("Step 2: Navigated to url http://automationexercise.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
