package org.sde;

import org.openqa.selenium.WebDriver;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		System.out.println(elements.size());
		
		driver.switchTo().frame("frame1");
		WebElement user = driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input"));
		user.sendKeys("Frames");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.switchTo().parentFrame(); 
		String text = driver.findElement(By.xpath("//b[text()='Topic :']")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		String text2 = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		System.out.println(text2);
		
	}

	}
