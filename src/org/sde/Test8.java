package org.sde;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
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
import org.openqa.selenium.support.ui.Select;

public class Test8 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=redmi+mobile&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_2_na_na_na&as-pos=1&as-type=RECENT&suggestionId=realme+mobile%7CMobiles&requestId=f22ed5b5-2c3d-478f-8612-f78ee3e4d630&as-searchtext=redmi");
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys(Keys.ENTER);		
	
		
		driver.findElement(By.xpath("//div[@class='_4rR01T'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='_4rR01T'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='_4rR01T'])[3]")).click();
	
		driver.findElement(By.xpath("//div[@class='_4rR01T'])[4]")).click();
	
		
		Set<String> child = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(child);
		
		driver.switchTo().window(li.get(1));
		String text = driver.findElement(By.xpath("//span[@class='B_NuCI']")).getText();
		System.out.println(text);
}
}
