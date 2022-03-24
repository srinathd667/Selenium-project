package org.sde;

import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); 
		driver.navigate().to("https://facebook.com/");
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		
		
		
		
		
	}

}