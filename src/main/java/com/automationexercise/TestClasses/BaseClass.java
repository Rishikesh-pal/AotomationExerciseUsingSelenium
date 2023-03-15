package com.automationexercise.TestClasses;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		WebDriverManager.chromedriver().setup();
		Properties prop=new Properties();
		FileReader reader=new FileReader("configs//TestData.properties");
		prop.load(reader);
		driver.get(prop.getProperty("website"));
	}

}
