package org.sde;

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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Test2 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);	 
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		a.dismiss();
		//TakesScreenshot tk = (TakesScreenshot) driver;	
		//File fileType = tk.getScreenshotAs(OutputType.FILE);
		//File Store = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\Press cancel");
		//FileUtils.copyFile(fileType, Store);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		String text = a.getText();
		System.out.println(text);
		a.sendKeys("Srinath");
		a.accept();
		TakesScreenshot tk = (TakesScreenshot) driver;	
		File fileType = tk.getScreenshotAs(OutputType.FILE);
		File Store = new File("C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\Hello Name");
		FileUtils.copyFile(fileType, Store);
		
		
		
		
		
	
	

}
	
}
