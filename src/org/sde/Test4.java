package org.sde;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();	
		
		WebElement sel = driver.findElement(By.tagName("select"));
		Select s = new Select(sel);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
		WebElement element	= options.get(i);
		String text = element.getText();
		System.out.println(text);
		
		WebElement option = s.getFirstSelectedOption();
		String text1 = option.getText();
		System.out.println();
		
			
		}
		
}
	
}
