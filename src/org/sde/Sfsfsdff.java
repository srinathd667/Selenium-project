package org.sde;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sfsfsdff {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://demo.automationtesting.in//Alerts.html");
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
			Alert a = driver.switchTo().alert();
			a.accept();
			
			driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			a.dismiss();
			
			driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			String text = a.getText();
			System.out.println(text);
			a.sendKeys("Selenium");
			a.accept();
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

	
	
	
	
	
	
	}
}
