package org.sde;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 { 

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://amazon.com/");
		driver.manage().window().maximize();
		

		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("dsfdnf@gmail");
		String attribute = user.getAttribute("value");
		if(attribute.equals("hfjkdhgkfj")) {
			System.out.println("valid");
		}
		else {
			System.out.println("Invalid");
		}	
	
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("34435555");
		
		WebElement linkText = driver.findElement(By.linkText("Forget password"));
		linkText.click();
		
		WebElement linkText1 = driver.findElement(By.partialLinkText("dkfhkdhkd"));
		linkText1.click();
		
		WebElement login = driver.findElement(By.xpath("kdsfflsdfll"));
		login.click();
		
		WebElement element = driver.findElement(By.xpath("hjkdhkhkfdg"));
		String text = element.getText();
		
		}
	}
