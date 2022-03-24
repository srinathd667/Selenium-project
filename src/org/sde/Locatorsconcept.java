package org.sde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locatorsconcept {
	
	public static void main(String[] args) throws Throwable{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https//www.amazon.com/");
		
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("dsfdnf@gmail");
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("34435555");
		
		
		
		
		
	}

}
