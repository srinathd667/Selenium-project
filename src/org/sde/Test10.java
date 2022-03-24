package org.sde;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test10 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebElement element = driver.findElement(By.xpath("//button[text()='X']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.OfSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi mobiles", Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='4rR01T'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='4rR01T'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='4rR01T'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='4rR01T'])[4]")).click();
		Thread.sleep(3000);
		
		Set<String> child = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(child);
		
		driver.switchTo().window(li.get(1));
		String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(text);
	
	

}

}