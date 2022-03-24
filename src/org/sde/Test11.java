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

public class Test11 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	

		List<WebElement> iTable = driver.findElements(By.tagName("table"));
		for (int i = iTable.size()*2; i < iTable.size(); i++) {
			WebElement table = iTable.get(i);
			WebElement tBody = table.findElement(By.tagName("tbody"));
			List<WebElement> iRow = tBody.findElements(By.tagName("tr"));

		for (int j = 0 ; j < iRow.size(); j++) {
				WebElement row = iRow.get(j);
				List<WebElement> iData = row.findElements(By.tagName("th"));

				for (int k = 0 ; k < iData.size(); k++) {
					WebElement data = iData.get(k);
					String text = data.getText();
					System.out.println(text);
				}

			}
		}

	}

}