package com.automationexercise.TestClasses;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationexercise.POMClasses.HomePageClass;
import com.automationexercise.POMClasses.LoginPageClass;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public WebDriver driver;
	public static Properties prop;
	HomePageClass homePage=new HomePageClass(driver);
	LoginPageClass loginPage=new LoginPageClass(driver);
	
//	private static Logger log= (Logger) LogManager.getLogger(BaseClass.class);
//	
	
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
		System.out.println("Step 1. Chrome opened ");
//		prop=new Properties();
//		FileInputStream fis=new FileInputStream("C:\\Users\\Rishi\\eclipse-workspace\\automationexercise\\configs\\TestData.properties");
//		prop.load(fis);
//		log.info("Step 1 done");
//		Properties prop=new Properties();
//		FileReader reader=new FileReader("configs//TestData.properties");
//		prop.load(reader);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("website"));
		System.out.println("Step 2: https://automationexercise.com opened");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		




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
