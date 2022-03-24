package org.sde;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://facebook.com/");

		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
		String text = element.getText();
		System.out.println(text);
		if (text.equals("Facebook helps you connect and share with the people in your life")) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
			
		WebElement login = driver.findElement(By.xpath("//*[text()='Create New Account']"));
		login.click();
		
		driver.findElement(By.name("firstname")).sendKeys("Srinath");
		
		driver.findElement(By.name("lastname")).sendKeys("Damodaran");
		
		driver.findElement(By.name("reg_email__")).sendKeys("djfdsjf@gmail.com");
		
		driver.findElement(By.name("reg_password__")).sendKeys("233454354");
		
		
		
		
		
		}

	}
}